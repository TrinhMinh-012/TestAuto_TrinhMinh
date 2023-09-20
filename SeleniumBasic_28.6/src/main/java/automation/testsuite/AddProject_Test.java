package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.AccoutConstant;
import automation.page.DashboardPage;
import automation.page.LoginPageFactory;
import automation.page.ProjectPage_AddProject;


public class AddProject_Test extends CommonBase {
	@BeforeTest
	public void Add_Project() {
		driver = initChromeDriver(AccoutConstant.WebUrl);
		LoginPageFactory factory = new LoginPageFactory(driver);
		factory.LoginFunctionFactory("admin@demo.com", "riseDemo");
	}
	@Test
	public void loginSuccessfully() {
//		LoginPageFactory factory = new LoginPageFactory(driver);
//		factory.LoginFunctionFactory("admin@demo.com", "riseDemo");
//		
//		DashboardPage dashboardPage = new DashboardPage();
//		pause(4000);;
//		WebElement expected = driver.findElement(dashboardPage.dashboardText);
//		assertTrue(expected.isDisplayed());
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		
		ProjectPage_AddProject addProjects = new ProjectPage_AddProject(driver);
		addProjects.AddProject( "asc", "10-10-2023", "On track","Perfect");
	}
	
	@AfterClass
	public void closeDriver() {
//		driver.close();
	}
}
