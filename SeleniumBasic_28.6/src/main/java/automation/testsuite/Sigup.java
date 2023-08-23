package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.AccoutConstant;
import automation.page.DanhSachKhoaHoc;
import automation.page.SigupPage;

public class Sigup extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver(AccoutConstant.WebUrlAlada);
	}
	
	@Test
	public void SiginSuccessfully() {
		SigupPage factory = new SigupPage(driver);
		factory.SignupFunction("TrinhMinh", "trinhminh2@gmail.com", "123456a@", "01669157882");
		
		DanhSachKhoaHoc dskh = new DanhSachKhoaHoc();
		WebElement expected = driver.findElement(dskh.textThongBao);
		assertTrue(expected.isDisplayed());
		
	}
}
