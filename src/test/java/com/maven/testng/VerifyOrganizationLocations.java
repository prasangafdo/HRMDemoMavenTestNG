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
	
	//@Test(priority=1)
	public void verifyAddLocationOnlyWithMandatoryData() {
		//Add button = btnAdd
		
		//Send keys = location_name
		
		//Select = location_country
	
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("location_name")).sendKeys("Test_Location0001");
		
		Select selectCountry = new Select(driver.findElement(By.id("location_country")));
		selectCountry.selectByVisibleText("Sri Lanka");
		
		driver.findElement(By.id("btnSave")).click();
		
		setSavedSuccessMessage(); //Locating the saved message using xpath in background worker class
		Assert.assertEquals(getSavedSuccessMessage(), getExpectedSavedMessage());

	}
	
	@Test(priority=2)
	public void verifyAddLocationWithAllDataFields() {
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("location_name")).sendKeys("Test_Location0002 with All data");
		
		Select selectCountry = new Select(driver.findElement(By.id("location_country")));
		selectCountry.selectByVisibleText("Sri Lanka");
		
		driver.findElement(By.id("location_province")).sendKeys("Test_Province002");
		driver.findElement(By.id("location_city")).sendKeys("Test_City Kandy");
		driver.findElement(By.id("location_address")).sendKeys("Test_Address 121, ABC Road, Kandy");
		driver.findElement(By.id("location_zipCode")).sendKeys("2354231");
		driver.findElement(By.id("location_phone")).sendKeys("0112345432");
		driver.findElement(By.id("location_fax")).sendKeys("0112345436");
		driver.findElement(By.id("location_notes")).sendKeys("Test_Note002 this is a test note");
		
		
		/*
		 * Locate below elements and send keys
		 * State/Province - location_province
			City - location_city
			Address - location_address
			Zip/Postal Code - location_zipCode
			Phone - location_phone
			Fax - location_fax
			Notes - location_notes
			
			Click on save button
			Add a verification point
		 */
	}

}
