package base;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.Utility;

public class ProjectSpecificationMethod extends Utility{

	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void launchBrowser(String browser,String url) {
		
		browserLaunch(browser,url);
		
	}
	
	
	@AfterMethod
	public void browserClose() {
		
		closeBrowser();
		
	}
	
	@DataProvider
	public String[][] excelData() throws IOException {
		
		String[][] data = readExcel();
		return data;
	}
	
}
