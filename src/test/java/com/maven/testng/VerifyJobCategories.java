package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyJobCategories extends BackgroundWorker{
	
	@BeforeClass
	public void navigateToJobCategories() {
		navigateToUserManagement();
		selectJobCategories();
	}
	
	@Test(dataProvider="extractedJobCategories", dataProviderClass = DataDriver.class)
	public void verifyAddJobCategory(String jobCategory) {
		//To run the before class method, we need to add at least one test method in TestNG
		driver.findElement(By.id("btnAdd")).click();
		Reporter.log(jobCategory);
	}

}
