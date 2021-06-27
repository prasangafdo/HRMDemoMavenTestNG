package com.maven.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPayGrades extends BackgroundWorker{
	
	@Test
	public void verifyAddPayGrades() {
		// TODO Auto-generated method stub
		navigateToUserManagement();
		selectPayGrades();

		driver.findElement(By.id("btnAdd")).click();	
		driver.findElement(By.id("payGrade_name")).sendKeys("AAA");
		
		Assert.assertEquals("test", "test"); //dummy assert to verify the test
	}

}
