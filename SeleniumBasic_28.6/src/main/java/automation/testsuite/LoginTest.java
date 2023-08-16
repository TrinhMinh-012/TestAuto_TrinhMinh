package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocator.LoginPage;
import automation.common.CommonBase;
import automation.constant.AccoutConstant;
import automation.page.DashboardPage;
import automation.page.loginPage;

public class LoginTest extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver(AccoutConstant.WebUrl);
	}
	@Test
	public void loginSuccessfully() {
		loginPage page = new loginPage(driver);
		page.LoginFunction("admin@demo.com", "riseDemo");
		DashboardPage dashboard = new DashboardPage();
		WebElement expected = driver.findElement(dashboard.dashboardText);
		assertTrue(expected.isDisplayed());
	}
	
	@Test
	public void loginFailEmail() {
		loginPage page = new loginPage(driver);
		page.LoginFunction("admin@mvhbdemo.com", "riseDemo");
		//Kiểm tra kết quả sau khi đăng nhập thất bại  
		
		WebElement expected = driver.findElement(page.autthenFailText);
		assertTrue(expected.isDisplayed());
	}
	  @Test
	  public void loginFail_IncorrectPass()
	  {
		  loginPage login = new loginPage(driver);
		  login.LoginFunction("admin@demo.com", "riseDemo1");
		// Kiểm tra text Authentication Fail error hiện lên khi login fail
		  WebElement txtError = driver.findElement(login.autthenFailText);
		  assertTrue(txtError.isDisplayed());
	  }
	  //Sai email và password
	  @Test
	  public void loginFail()
	  {
		  loginPage login = new loginPage(driver);
		  login.LoginFunction("admin1@demo.com", "riseDemo1");
		// Kiểm tra text Authentication Fail error hiện lên khi login fail
		  WebElement txtError = driver.findElement(login.autthenFailText);
		  assertTrue(txtError.isDisplayed());
	  }
}
