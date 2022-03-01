package com.maven.testng.page;

import org.openqa.selenium.Dimension;

import com.maven.testng.util.BrowserManager;

public class CommonPage extends BrowserManager{
	//This class contains the common methods that I can use for all the pages
	
	public void setResolutionTo1080p() {
		driver.manage().window().setSize(new Dimension(1920, 1080));
	}

	
}
