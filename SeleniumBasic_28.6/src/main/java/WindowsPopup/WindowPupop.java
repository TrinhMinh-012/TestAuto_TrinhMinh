package WindowsPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class WindowPupop extends CommonBase {
	@BeforeTest
	public void openBrowser() {
		driver = initChromeDriver("https://demo.guru99.com/popup.php");
	}
	@Test
	public void TestPupopWindow() {
		click(By.xpath("//a[contains(@href,'popup.php')]"));
		//Lấy lại lớp window
		String  MainWindow = driver.getWindowHandle();
		Set<String> windows =driver.getWindowHandles();
		for(String window : windows) {
			System.out.println(window);
			if(!MainWindow.equals(window)) {
				driver.switchTo().window(window);
				pause(2000);
				System.out.println("Đã chuyển đến lớp Window");
			System.out.println("Title: "+ driver.switchTo().window(window).getTitle());
			System.out.println("CurentTitle: "+ driver.switchTo().window(window).getCurrentUrl());
			type(By.name("emailid"), "testdemo@gmail.com");
			click(By.name("btnLogin"));
			String text = driver.findElement(By.xpath("//table//td//h2")).getText();
			System.out.println(text);
			Assert.assertEquals(text, "Access details to demo site.");
			driver.close();
			}
		}
		
		driver.switchTo().window(MainWindow);
		System.out.println("Đã chuyển về lớp Window chính: " + driver.getCurrentUrl());
		
	}
}
