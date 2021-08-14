package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyEmploymentStatus extends BackgroundWorker{
	
	@BeforeClass
	public void navigate() {
		navigateToUserManagement();
		selectEmpStatus();
	}
	
	@Test(priority=1, dataProvider="extractedEmploymentStatus", dataProviderClass=DataDriver.class)
	public void verifyAddEmploymentStatus(String employmentStatus) {
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("empStatus_name")).sendKeys(employmentStatus);
		driver.findElement(By.id("btnSave")).click();
		
		//Verification point
		//String actualResult = driver.findElement(By.xpath("*//div/div[@class='message success fadable']")).getText();
	//	String expectedResult = "Successfully Saved";
		
		setActualSavedSuccessMessage();
		Assert.assertEquals(getActualSavedSuccessMessage(), getExpectedSavedMessage());
	}

}
