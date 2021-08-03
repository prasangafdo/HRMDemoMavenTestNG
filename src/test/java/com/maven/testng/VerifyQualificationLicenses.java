package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyQualificationLicenses extends BackgroundWorker{
	
	@BeforeClass
	public void navigateToLicenses() {
		selectLicense();
	}
	
	String licenseName = "Test License name 0001"; //Change the variable value for the input if needed
	
	@Test
	public void VerifyAddLicense() {//Since this test case has only one input field, I'm not going to use a data provider to test with different data.
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("license_name")).sendKeys(licenseName);
		driver.findElement(By.id("btnSave")).click();
	}

}
