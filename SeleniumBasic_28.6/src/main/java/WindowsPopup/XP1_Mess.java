package WindowsPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class XP1_Mess extends CommonBase {
	@BeforeTest
	public void openBrowser() {
		driver = initChromeDriver("https:codestar.vn/");
	}
	@Test
	public void ChatLogin () {
		click(By.xpath("//span[text() ='Bắt đầu chat']"));
		click(By.xpath("//span[text() ='Sử dụng Messenger']"));
		String  MainWindow = driver.getWindowHandle();
		Set<String> windows =driver.getWindowHandles();
		for(String window : windows) {
			System.out.println(window);
			if(!MainWindow.equals(window)) {
				driver.switchTo().window(window);
				pause(2000);
				System.out.println("Đã chuyển đến lớp Window");
		
			}
		}
		
	}
}
