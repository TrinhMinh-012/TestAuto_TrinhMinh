package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.AccoutConstant;
import automation.page.DashboardPage;
import automation.page.LoginPageFactory;

public class LoginTestFactory extends CommonBase {
	@BeforeTest
	public void openApplication() {
		driver = initChromeDriver(AccoutConstant.WebUrl);

	}
	@Test
	public void loginSuccessfully() {
		LoginPageFactory factory = new LoginPageFactory(driver);
		factory.LoginFunctionFactory("admin@demo.com", "riseDemo");
		
		DashboardPage dashboardPage = new DashboardPage();
		pause(4000);;
		WebElement expected = driver.findElement(dashboardPage.dashboardText);
		assertTrue(expected.isDisplayed());
		
	}
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
}
