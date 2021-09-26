package com.maven.testng.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.function.Login;
import com.maven.testng.util.BrowserManager;

public class LoginTest extends BrowserManager{
	
	@Test(priority = 1)
	public static void verifyLoginAsInvaliduser() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
	Login.verifyLoginAsInvalidUser();
	//Add a verification point


	}
	
	@Test(priority = 2)
	public void verifyLoginAsValidUser() {
	SoftAssert softAssert = new SoftAssert();

	Login.verifyLoginAsValidUser();	
	softAssert.assertEquals(Login.getCurrentURL(), Login.getExpectedURL());
//	Login.logout();
	
	//driver.close();
	softAssert.assertAll();
	}
	
	
//		
//	@AfterMethod
//	public void endSession() {
//	//driver.close();
//		driver.quit();
//		driver = null; 
//		driver = new ChromeDriver();
//	}

	@BeforeMethod
	public void beforeMethod() {
		createSession();
		initiateURL();
	}
	@AfterMethod
	public void afterMethod() {
		endSession();
	}
	
//	@Test
//	public void aaa() {
//				
//		driver.get("https://opensource-demo.orangehrmlive.com/");	
//		//driver.close();
//
//	}
//
//
//
//	@Test
//	public void sss() {
//		driver.get("https://google.com/");	
//
//	}
}
