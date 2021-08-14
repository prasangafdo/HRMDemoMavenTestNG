package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyQualificationMemberships extends BackgroundWorker{

	@BeforeClass
	public void navigate() {
		selectMemberships();
	}
	
	String MembershipName = "Test Membership name 0001"; //Change the variable value for the input if needed
	
	@Test
	public void VerifyAddMemberships() {
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("membership_name")).sendKeys(MembershipName);
		driver.findElement(By.id("btnSave")).click();
		
		setActualSavedSuccessMessage();
		Assert.assertEquals(getActualSavedSuccessMessage(), getExpectedSavedMessage());
	}
}
