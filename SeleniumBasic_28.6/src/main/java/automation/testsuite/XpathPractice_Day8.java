package automation.testsuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class XpathPractice_Day8 extends CommonBase {
//	@BeforeTest
//	public void opnePage() {
//		driver = initChromeDriver("https://bepantoan.vn/danh-muc/may-hut-mui-ong-khoi");
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		}
////	@Test
////	public void findById() {
////		driver.findElement(By.id("email"));
////		System.out.println("Found email elemant");
////		driver.findElement(By.id("password"));
////		System.out.println("Found pass elemant");
////	}
//	
//	//Máy hút bụi ống khói
////	@Test
////	public void findByLinkText() {
////		driver.findElement(By.linkText("Máy hút bụi ống khói"));
////		System.out.println("Found alement by linhText");
////		driver.findElement(By.partialLinkText("Ống khói"));
////		System.out.println("Found alement by PảtialLinkText");
//////		Tìm element có text là "Máy Hút Mùi Cổ Điển"
////		driver.findElement(By.linkText("Máy Hút Mùi Cổ Điển"));
////		System.out.println("Found alement by linhText");
////		driver.findElement(By.partialLinkText("Cổ Điển"));
////		System.out.println("Found alement by PảtialLinkText");
////	}
//	
//	@Test
//	public void FindName() {
//		driver.findElement(By.className("cursor-pointer"));
//		driver.findElement(By.tagName("input"));
//		System.out.println("Frond alemnt name");
//	}
//	
//	@Test
//	public void findByName() {
//		driver.findElement(By.name("email"));
//		System.out.println("Found email elemant");
//		driver.findElement(By.name("password"));
//		System.out.println("Found password elemant");
//		
//	}
//	
//	@AfterClass
//	public void quitDriver() {
////		driver.close();
//	}

	@Test
	public void isRadioBuuton() {
		driver = initChromeDriver("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		WebElement checkBox= driver.findElement(By.xpath("'(//input[@value='Male' and  @type ='radio'])[1]'"));
		boolean isSelect  = checkBox.isSelected();
		if(isSelect == false ) {
			checkBox.click();
			System.out.println("Male button is:" + isSelect);
		}
		else {
			WebElement checkBoxFemale= driver.findElement(By.xpath("'(//input[@value='Male' and  @type ='radio'])[1]'"));
			checkBoxFemale.click();
			System.out.println("Male button is  select");
		}
	}
	
	
}
