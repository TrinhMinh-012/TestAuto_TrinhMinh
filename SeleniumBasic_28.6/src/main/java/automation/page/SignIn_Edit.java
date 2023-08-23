package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Edit {
	private WebDriver driver;

	@FindBy (id= "txtLoginUsername")
	private WebElement txtLogin;
	
	@FindBy(id= "txtLoginPassword")
	private WebElement txtPass;
	
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @type ='submit']")
	private WebElement buttonLogin;
	
	@FindBy(xpath = "//a[text()='Đăng Nhập']")
	private WebElement buttonLogin1;
	
	@FindBy(xpath = "//div[@class='avatar2']")
	private WebElement buttonAvatar;
	
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']")
	private WebElement buttonEdit;
	
	public SignIn_Edit(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Login (String Email, String Pass) {
		buttonLogin1.click();
		txtLogin.sendKeys(Email);
		txtPass.sendKeys(Pass);
		buttonLogin.click();
		buttonAvatar.click();
		buttonEdit.click();
	}
}
