package test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC001_LoginTest extends ProjectSpecificationMethod{

	@BeforeTest
	public void setup() {
		
		excelFile="TC001_LoginTestData";
	}
	
	@Test(dataProvider = "excelData")
	public void loginTest(String mailid,String pass) throws IOException { // order and no.of columns
		// TODO Auto-generated method stub
		
		HomePage obj = new HomePage(driver);
		obj.loginButtion()
		.email(mailid)
		.password(pass)
		.submit(); // form 
		
		
	}

}
