package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoWebShop {

	public static ExtentReports getReport() {
		
		// Create physical report
		String path="D:\\EclipseClass\\DemoWebShopProject\\reports\\DemoWebShopReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("DemoWebShop Report");
		
		//Add automation data to physical report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
	}
}
