package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNg {

	
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before method");
	}
	
	@Test
	public void testM() {
		
		System.out.println("Test method");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After class method");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test Method");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("After Suite Method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before Suite Method");
	}
	
}
