package com.maven.testng.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.function.Common;
import com.maven.testng.function.Login;
import com.maven.testng.util.BrowserManager;

public class LoginTest extends BrowserManager{
	
	@Test(priority = 1)
	public void verifyLoginAsInvaliduser() {
		SoftAssert softAssert = new SoftAssert();
		createSession();
		initiateURL();
		Common.setResolutionTo1080p();
		Login.verifyLoginAsInvalidUser();
		softAssert.assertTrue(Login.isLoginFailedErrorDisplayed());
		softAssert.assertAll();
	}
	
	@Test(priority = 2)
	public void verifyLoginAsValidUser() {
	SoftAssert softAssert = new SoftAssert();
	createSession();
	initiateURL();

	Login.verifyLoginAsValidUser();	
	softAssert.assertTrue(Login.isHRMLogoDisplayed());
//	Login.logout();
	
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

	//@BeforeMethod
	public void beforeMethod() {
		createSession();
		initiateURL();
	}
//	@AfterMethod
//	public void afterMethod() {
//		endSession();
//	}
	
}
