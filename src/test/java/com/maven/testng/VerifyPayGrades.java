package com.maven.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class VerifyPayGrades extends BackgroundWorker{
	
		//DataDriver dataDriver = new DataDriver();
	

	
		
	@Test (dataProvider = "payGrades", dataProviderClass = DataDriver.class)//Calling data provider method in a different class
	public void verifyAddPayGrades(String data) throws BiffException, IOException {

		Reporter.log(data);
		navigateToUserManagement();
		selectPayGrades();
		
		

		driver.findElement(By.id("btnAdd")).click();	
		driver.findElement(By.id("payGrade_name")).sendKeys(data);
		driver.findElement(By.id("btnSave")).click();
		
		String actualResult = driver.findElement(By.xpath("*//div/div[@class='message success fadable']")).getText();
		String expectedResult = "Successfully Saved";
		
		Assert.assertEquals(actualResult, expectedResult);
	}

}
