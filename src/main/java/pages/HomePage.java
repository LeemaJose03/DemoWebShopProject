package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod{
	
	@FindBy(className = "ico-login")
	WebElement login;
	
	@FindBy(className = "ico-register")
	WebElement register;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public LoginPage loginButtion() {
		
		login.click();
		return new LoginPage(driver);
	}

	public RegisterPage registerButton() {
		
		register.click();
		return new RegisterPage(driver);
	}
}
