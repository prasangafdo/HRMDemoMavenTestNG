package com.maven.testng.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {

//	static {
//		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver/chromedriver.exe");
//		
//			}

	public static WebDriver driver;
	public void createSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();//Change the driver here for configuration
	}
	public void initiateURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public void endSession() {
		driver.quit();
		driver= null;
	}
	
}
