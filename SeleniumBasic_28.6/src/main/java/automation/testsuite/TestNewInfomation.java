package automation.testsuite;

import java.sql.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.AccoutConstant;
import automation.page.EditInformation;
import automation.page.SignIn_Edit;

public class TestNewInfomation extends CommonBase {
	@BeforeTest
	public void TestNewInformation() {
		driver = initChromeDriver(AccoutConstant.WebSignInAlada);
	}
	
	@Test
	public void Test1() {
		
		SignIn_Edit NewEdit = new SignIn_Edit(driver);
		NewEdit.Login("trinhminh2@gmail.com", "1234567a@");
		
		EditInformation Edit = new EditInformation(driver);
		Edit.Edit("trinhminh2@gmail.com","1234567a@", "123456a@");
	
	}
	
	
}
