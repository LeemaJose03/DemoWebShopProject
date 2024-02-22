package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility  {

public static WebDriver driver;
public String excelFile;
	
	public void browserLaunch(String browser,String url) {
		
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		} else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void closeBrowser() {
		
		driver.close();
	}
	
	public void findElementAndSendKeys(String attributeValue , String value) {
		
		driver.findElement(By.id(attributeValue)).sendKeys(value);
	}
	
	public void explicitVidibilityOfWait(WebElement ele, int seconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public void click(WebElement ele) {
		
		ele.click();
		
	}
	
	public String[][] readExcel() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("D:\\EclipseClass\\DemoWebShopProject\\data\\"+excelFile+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data= new String[rowCount][columnCount];
		
		// Get into row
		
		for(int i=1;i<=rowCount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
		// Get into cell
			
			for(int j=0;j<columnCount;j++) {
				
				XSSFCell cell = row.getCell(j);
				
				//read the data from excel
				
				data[i-1][j] = cell.getStringCellValue(); // i =1 , j=0  -- i=0 j=0
					
			}	
		}
		book.close();
		return data;
	}

	public String getScreenshot(String screenshotName) throws IOException {
		
		String path="D:\\EclipseClass\\DemoWebShopProject\\snap\\"+screenshotName+".png";
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
		
		return path;
		
	}

}
