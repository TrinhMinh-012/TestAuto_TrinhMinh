package WindowsPopup;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class IframeLogin extends CommonBase {
	@BeforeMethod
	public void openPage () {
		driver = initChromeDriver("https:codestar.vn/");
	}
	
	@Test
	public void handleIFrame() {
		System.out.println("IFrame total: " + driver.findElements(By.tagName("iframe")).size());
		scrollToElement(By.xpath("//h2[text()='Đăng ký nhận tài liệu:']"));
		driver.switchTo().frame(3);
		type(By.xpath("//input[@class='getfly-input ' and @name='account_name']"), "TrinhMinh");
		type(By.id("account_phone"), "0378157882");
		click(By.xpath("//button[text()='Đăng ký ngay']"));
	}
	@Test
	public void findIFrame1() {
		pause(10000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Số lượng frame: " + size);
		for(int i=0; i<size; i++) {
			driver.switchTo().frame(i);
			int numberOfIframe = driver.findElements(By.xpath("//button[text()='Đăng ký ngay']")).size();
			if(numberOfIframe != 0) {
				System.out.println("ElementCanTim ở vị trí thứ: " + i);
			}
			driver.switchTo().defaultContent();
		}
	}
	
}
