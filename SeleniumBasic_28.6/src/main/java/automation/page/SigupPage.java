package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigupPage {
	private WebDriver driver;
	@FindBy(id= "txtFirstname")
	private WebElement txtHoTen;
	@FindBy (id= "txtEmail")
	private WebElement txtEmail;
	@FindBy(id= "txtCEmail")
	private WebElement txtConfirmEmail;
	@FindBy (id= "txtPassword")
	private WebElement txtPass;
	@FindBy(id= "txtCPassword")
	private WebElement txtConfirmPass;
	@FindBy (id= "txtPhone")
	private WebElement txtPhone;
	@FindBy(xpath = "//button[text()='ĐĂNG KÝ' and @type= 'submit']")
	private WebElement buttonSigup;
	public SigupPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
		
	}
	public void SignupFunction(String firstName, String email, String pass, String Phone ) {
		txtHoTen.sendKeys(firstName);
		txtEmail.sendKeys(email);
		txtConfirmEmail.sendKeys(email);
		txtPass.sendKeys(pass);
		txtConfirmPass.sendKeys(pass);
		txtPhone.sendKeys(Phone);
		buttonSigup.click();
	}
	


	
}
