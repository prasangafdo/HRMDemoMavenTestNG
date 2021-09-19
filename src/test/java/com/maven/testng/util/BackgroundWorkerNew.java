package com.maven.testng.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundWorkerNew {
	

	
	static {
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver/chromedriver.exe");
		
			}
	public WebDriver driver;
	public void createSession() {
		driver = new ChromeDriver();//Change the driver here for configuration
	}
	public void endSession() {
		driver.quit();
	}
	
}
