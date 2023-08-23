package automation.page;

import javax.swing.plaf.basic.BasicTextPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	@FindBy(id = "email")
	private WebElement txtemail ;
	@FindBy(id = "password")
	private WebElement txtpass ;
	@FindBy(xpath= "//button[text()='Sign in']")
	private WebElement buttonLogin ;
	
	private WebDriver driver ;

	public LoginPageFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void LoginFunctionFactory( String email, String pass) {
		txtemail.clear();
		txtemail.sendKeys(email);
		txtpass.clear();
		txtpass.sendKeys(pass);
		buttonLogin.click();
	}
	
}
