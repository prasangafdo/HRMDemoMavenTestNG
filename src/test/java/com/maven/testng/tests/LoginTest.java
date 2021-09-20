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
	//	Login.loadLoginPage();
	Login.verifyLoginAsInvalidUser();
	//Add a verification point
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.name("Submit")).click();

	}
	
	@Test(priority = 2)
	public void verifyLoginAsValidUser() {
	SoftAssert softAssert = new SoftAssert();

	Login.verifyLoginAsValidUser();	
//	softAssert.assertEquals(Login.getCurrentURL(), Login.getExpectedURL());
//	Login.logout();
//	softAssert.assertAll();
	//driver.close();
	
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
