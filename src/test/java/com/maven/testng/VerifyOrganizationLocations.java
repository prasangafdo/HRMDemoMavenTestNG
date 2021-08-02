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
		//Since data driven testing for these elements are covered in "verifyAddLocationWithAllDataFields" method,not using data driven testing with this method
	
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("location_name")).sendKeys("Test_Location0001X");
		
		Select selectCountry = new Select(driver.findElement(By.id("location_country")));
		selectCountry.selectByVisibleText("Sri Lanka");
		
		driver.findElement(By.id("btnSave")).click();
		
		setActualSavedSuccessMessage(); //Locating the saved message using xpath in background worker class
		Assert.assertEquals(getActualSavedSuccessMessage(), getExpectedSavedMessage());

	}
	
	@Test(priority=2, dataProvider ="extractedOrganizationLocations", dataProviderClass = DataDriver.class)
	public void verifyAddLocationWithAllDataFields(String locationName, String country, String state, String city, String address, String zipCode, String phone, String fax, String notes) {
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("location_name")).sendKeys(locationName);
		
		Select selectCountry = new Select(driver.findElement(By.id("location_country")));
		selectCountry.selectByVisibleText(country);
		
		driver.findElement(By.id("location_province")).sendKeys(state);
		driver.findElement(By.id("location_city")).sendKeys(address);
		driver.findElement(By.id("location_address")).sendKeys(address);
		driver.findElement(By.id("location_zipCode")).sendKeys(zipCode);
		driver.findElement(By.id("location_phone")).sendKeys(phone);
		driver.findElement(By.id("location_fax")).sendKeys(fax);
		driver.findElement(By.id("location_notes")).sendKeys(notes);
		
		driver.findElement(By.id("btnSave")).click();
		setActualSavedSuccessMessage(); //Locating the saved message using xpath in background worker class
		Assert.assertEquals(getActualSavedSuccessMessage(), getExpectedSavedMessage());

	}

}
