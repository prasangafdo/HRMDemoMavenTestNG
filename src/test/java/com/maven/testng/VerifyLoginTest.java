package com.maven.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyLoginTest {
	
	@Test
	public void verifyLoginwithCorrectCredentials() {
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/Prasanga Fernando/Documents/Eclipse/TestNG_PageTitle/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Assert.assertEquals("test", "test");
	System.out.println("This is a sample test");
	}
	
	
	

}
