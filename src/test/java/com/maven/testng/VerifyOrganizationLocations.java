package com.maven.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyOrganizationLocations extends BackgroundWorker{


	//To locate the parent element we can use below syntax
	String aa = "//*/td/a[text()='Canadian Regional HQ']/../../td/input";
	
	@BeforeClass
	public void navigateToOrganizationLocations() {
		selectLocations();
		
	}
	
	@Test(priority=1)
	public void verifyAddLocationOnlyWithMandatoryData() {
		//Add button = btnAdd
		
		//Send keys = location_name
		
		//Select = location_country
	
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("location_name")).sendKeys("Test_Location0001");
		
		Select selectCountry = new Select(driver.findElement(By.id("location_country")));
		selectCountry.selectByVisibleText("Sri Lanka");
		
		driver.findElement(By.id("btnSave")).click();
		
		setSavedSuccessMessage();
		Assert.assertEquals(getSavedSuccessMessage(), getExpectedSavedMessage());

	}
	
	@Test(priority=2)
	public void verifyAddLocationWithAllDataFields() {
		
	}
	
}
