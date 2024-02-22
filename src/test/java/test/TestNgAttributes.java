package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgAttributes {

	
	@Test(dependsOnMethods = "test3",alwaysRun = true)
	public void test1() {
		
		System.out.println("Test 1");
	}
	
	@Ignore
	@Test(priority = 3, invocationCount = 3, invocationTimeOut = 1,threadPoolSize = 2)
	public void test2() {
		
		System.out.println("Test 2");
		
	}
	
	@Test(timeOut = 1000)
	public void test3() {
		
		System.out.println("Test 3");
	}
	
}
