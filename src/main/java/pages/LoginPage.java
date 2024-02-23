package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod{

	
	
	@FindBy(xpath = "//span[contains(text(),'Login was unsuccessful')]")
	WebElement expMessage;
	
	public LoginPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public LoginPage email(String email) {
		
		findElementAndSendKeys("Email", email);
		return this;
	}
	
	public LoginPage password(String password) {
		
		findElementAndSendKeys("Password", password);
		return this;
	}
	
	public LoginPage submit() {
		
		WebElement login = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		explicitVidibilityOfWait(login, 10);
		click(login);
		
		// Hard Assertion
//		String actual = expMessage.getText();
//		String expected = "Login was unsuccessful. Please correct the errors and try again.";
//		
//		Assert.assertEquals(expected,actual);
//		
		// Soft assertion
		
		/*SoftAssert assertObj = new SoftAssert();
		assertObj.assertEquals(expected, actual);
		assertObj.assertAll(); // mandatory at the end to throw the expection. */
		return this;
	}
}
