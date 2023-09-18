package automation.page;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.testsuite.AddProject_Test;

public class ProjectPage_AddProject {
	@FindBy(xpath= "//span[text()='Projects' and @class='menu-text ']")
	private WebElement buttonProjects ;
	@FindBy(xpath= "//a[text()=' Add project' and @title='Add project' ]")
	private WebElement buttonAddProjects ;
	
	@FindBy(id= "title")
	private WebElement txtTitle;
	
//	@FindBy(xpath= "//button[@type='submit' and text()=' Save']")
//	private WebElement buttonSave ;
	
	public void  AddProjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath= "//button[@type='submit' and text()=' Save']")
	private WebElement buttonSave ;
	private WebDriver driver ;

	public ProjectPage_AddProject (WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void AddProject( String title) {
		buttonProjects.click();
		buttonAddProjects.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		txtTitle.sendKeys(title);
		buttonSave.click();
	}
	
}
