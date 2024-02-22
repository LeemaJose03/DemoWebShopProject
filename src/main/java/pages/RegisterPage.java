package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class RegisterPage extends ProjectSpecificationMethod {

	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public RegisterPage gender() {
		
		driver.findElement(By.id("gender-male")).click();
		return this;
	}
	
	public RegisterPage firstName(String fname) {
		
		driver.findElement(By.id("FirstName")).sendKeys(fname);
		return this;
	}
	
	public RegisterPage lastName(String lname) {
		
		driver.findElement(By.id("LastName")).sendKeys(lname);
		return this;
	}
	
	public RegisterPage regEmail(String mail) {
		
		driver.findElement(By.id("Email")).sendKeys(mail);
		return this;
	}
	
	public RegisterPage regPass(String pass) {
		
		driver.findElement(By.id("Password")).sendKeys(pass);
		return this;
	}
	
	public RegisterPage regConPass(String Conpass) {
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Conpass);
		return this;
	}
	
	public RegisterPage regButton() {
		
		driver.findElement(By.id("register-button")).click();;
		return this;
	}
	
	
}
