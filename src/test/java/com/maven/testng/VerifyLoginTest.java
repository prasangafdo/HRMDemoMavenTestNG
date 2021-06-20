package com.maven.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLoginTest extends BackgroundWorker{
	
	private String Username = "Admin";
	private String Password = "abcd";
	
//	BackgroundWorker worker = new BackgroundWorker();
//
//		static {
//			System.setProperty("webdriver.chrome.driver", "C:/Users/Prasanga Fernando/Documents/Eclipse/TestNG_PageTitle/chromedriver/chromedriver.exe");
//				}
//		 WebDriver driver = new ChromeDriver();
		 
		@Test(priority=2)
		public void verifyLoginWithCorrectCredentials() {
			Username  = "Admin";
			Password = "admin123";//Entering correct credentials for a successful login
			
			// driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.findElement(By.id("txtUsername")).sendKeys(Username);
			 driver.findElement(By.id("txtPassword")).sendKeys(Password);	
			 driver.findElement(By.name("Submit")).click();
			 
			String expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
			String actual =driver.getCurrentUrl();
			Assert.assertEquals(actual, expected);
		}
		
		@BeforeTest
		public void  getURL() {
			 driver.get("https://opensource-demo.orangehrmlive.com/"); //Setting initial URL
		}
	
	
		@Test(priority=1)
		public void verifyLoginErrorMessage() {
			
			 driver.findElement(By.id("txtUsername")).sendKeys(Username);
			 driver.findElement(By.id("txtPassword")).sendKeys(Password);	
			 driver.findElement(By.name("Submit")).click();
			 
			String errorMessage = driver.findElement(By.id("spanMessage")).getText();			
			Assert.assertEquals(errorMessage, "Invalid credentials");
		}
		
		@AfterClass
		public void closeBrowser() {
			//driver.close();
		}
	
	
	

}
