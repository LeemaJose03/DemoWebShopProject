package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC002_RegisterTest extends ProjectSpecificationMethod{

	@Test
	public void registerTest() throws IOException {
		// TODO Auto-generated method stub

		FileReader reader = new FileReader("D:\\EclipseClass\\DemoWebShopProject\\src\\test\\resources\\Testdata.properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		HomePage obj = new HomePage(driver);
		obj.registerButton()
		.gender()
		.firstName("Leema")
		.lastName("Josephine")
		.regEmail("Leema@gmail.com")
		.regPass("Leema.123")
		.regConPass("Leema.123")
		.regButton();
	}

}
