package automation.page;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.common.CommonBase;
import automation.testsuite.AddProject_Test;

public class ProjectPage_AddProject  extends CommonBase{


	
	public void  AddProjectPage(WebDriver driver) {
		this.driver = driver;
	};
	
	
	
	private By buttonProjects = By.xpath("//span[text()='Projects' and @class='menu-text ']");
	private By buttonAddProjects = By.xpath("//a[text()=' Add project' and @title='Add project' ]");
	private By txtTitle = By.id("title");
	private By buttonSave = By.xpath("//button[@type='submit' and text()=' Save']");
	private By DropClient = By.xpath("//span[@id='select2-chosen-9']");
	private By start_Date = By.xpath("//input[@name='start_date']");
	private By client = By.xpath("//span[@id='select2-chosen-109']");
	private By label = By.xpath("//input[@id='s2id_autogen8']");
	
	
	private WebDriver driver ;
	
	
	public ProjectPage_AddProject (WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void AddProject( String title, String start_date, String label1,String label2  ) {
		click(buttonProjects);
		click(buttonAddProjects);
		type(txtTitle, title);
//		click(DropClient);
//		pause(3000);
//		type(DropClient,"Internal Project");
//		driver.findElement(DropClient).sendKeys(Keys.TAB);
		type(client,"Hauck Ltd");
		driver.findElement(client).sendKeys(Keys.TAB);
		type(start_Date, start_date);
		type(label, label1);
		driver.findElement(label).sendKeys(Keys.TAB);
		type(label, label2);
		driver.findElement(label).sendKeys(Keys.TAB);
		click(buttonSave);
		
	}
	
}
