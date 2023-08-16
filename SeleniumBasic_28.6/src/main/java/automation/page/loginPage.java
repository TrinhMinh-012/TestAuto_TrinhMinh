package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	private By txtemail = By.id("email");
	private By txtpass = By.id("password");
	private By buttonLogin = By.xpath("//button[text()='Sign in']");
	private WebDriver driver ;
	
	public By autthenFailText = By.xpath("//div[normalize-space()='Authentication failed!' and @role='alert']");
	
	public loginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public void LoginFunction (String email , String password  ) {
		WebElement textboxEmail = driver.findElement(txtemail);
		if(textboxEmail.isDisplayed()) {
			textboxEmail.clear(); // Do trang login được nhập sẵn text nên cần phải clear
			textboxEmail.sendKeys(email);
		}
		
		WebElement textboxPass = driver.findElement(txtpass);
		if(textboxPass.isDisplayed()) {
			textboxPass.clear();
			textboxPass.sendKeys(password);
		}
		WebElement btnLogin = driver.findElement(buttonLogin);
		if(btnLogin.isDisplayed()) {
			btnLogin.click();
		}
	}
}
