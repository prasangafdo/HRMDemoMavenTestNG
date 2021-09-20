package com.maven.testng.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.function.Login;
import com.maven.testng.util.BackgroundWorkerNew;

public class LoginTest extends BackgroundWorkerNew{
	
//	@Test(priority = 1)
//	public void verifyLoginAsInvaliduser() {
//	//	initateDriver();
//		static WebDriver driver = new ChromeDriver();
//		
//		setWebDriver();
//		Login.loadLoginPage();
//	Login.verifyLoginAsInvalidUser();
//	//Add a verification point
//	clearSession();
//	}
//	
//	@Test(priority = 2)
//	public void verifyLoginAsValidUser() {
//	SoftAssert softAssert = new SoftAssert();
//	setWebDriver();
//	//initateDriver();
//	Login.loadLoginPage();
//	Login.verifyLoginAsValidUser();	
//	softAssert.assertEquals(Login.getCurrentURL(), Login.getExpectedURL());
//	Login.logout();
//	clearSession();
//	softAssert.assertAll();
//	//driver.close();
//	
//	}
	
	
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
	}
	@AfterMethod
	public void afterMethod() {
		endSession();
	}
	
	@Test
	public void aaa() {
				
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		//driver.close();

	}



	@Test
	public void sss() {

		driver.get("https://google.com/");	

	}
}
