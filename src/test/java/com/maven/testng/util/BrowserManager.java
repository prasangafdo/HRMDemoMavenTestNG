package com.maven.testng.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {

	static {
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver/chromedriver.exe");
		
			}
	public static WebDriver driver;
	public void createSession() {
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
