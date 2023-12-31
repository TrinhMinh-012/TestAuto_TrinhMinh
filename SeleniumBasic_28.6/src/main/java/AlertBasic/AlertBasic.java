package AlertBasic;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AlertBasic extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
	}
	@Test
	public void TestAlert() {
		driver.findElement(By.name("cusid")).sendKeys("123456");
		driver.findElement(By.name("submit")).submit();
		pause(2000);
		// Khai báo chuyển hướng đến Alert với đối tượng
		Alert alert = driver.switchTo().alert();
		String AlertMessge = driver.switchTo().alert().getText();
		assertEquals(AlertMessge, "Do you really want to delete this Customer?");
		pause(2000);
		driver.switchTo().alert().accept();
		pause(2000);
		}
	@AfterClass
	public void closePage() {
//		quitDriver(driver);
	}
}
