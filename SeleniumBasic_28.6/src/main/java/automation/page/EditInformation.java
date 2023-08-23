package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditInformation {
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@type= 'text' and @class='maxwidth' ]")
	private WebElement txtTen;
	
	@FindBy (id= "txtpassword")
	private WebElement txtPass;
	
	@FindBy(id= "txtnewpass")
	private WebElement txtNewPass;
	
	@FindBy (id= "txtrenewpass")
	private WebElement txtrenewpass;

	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']")
	private WebElement buttonEdit;
	
	public EditInformation(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
		
	}
	
	public void Edit( String Email, String Pass, String NewPass  ) {
		txtTen.sendKeys(Email);
		txtPass.sendKeys(Pass);
		txtNewPass.sendKeys(NewPass);
		txtrenewpass.sendKeys(NewPass);
		buttonEdit.click();
	}

}
