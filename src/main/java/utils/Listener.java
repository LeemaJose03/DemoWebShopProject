package utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecificationMethod;

public class Listener extends ProjectSpecificationMethod implements ITestListener{

	
	ExtentReports extent= ExtentReportDemoWebShop.getReport();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		
		String filepath=null;
		try {
			filepath=getScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName() );
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skippped");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}

	
	
}
