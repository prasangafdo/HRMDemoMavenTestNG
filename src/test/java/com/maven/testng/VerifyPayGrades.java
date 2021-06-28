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
	
		DataDriver dataDriver = new DataDriver();
	

	@Test (dataProvider = "payGrades", dataProviderClass = DataDriver.class)//Calling data provider method in a different class
	public void verifyAddPayGrades(String data) throws BiffException, IOException {
	//	dataDriver.sheetNumber =1;
		//dataDriver.getWorkbook();
		//dataDriver.ExtractedUser();
			//Reporter.log(data);
		// TODO Auto-generated method stub
		//navigateToUserManagement();
		//selectPayGrades();
		
		

		//driver.findElement(By.id("btnAdd")).click();	
		//driver.findElement(By.id("payGrade_name")).sendKeys("AAA");
		
		//Assert.assertEquals("test", "test"); //dummy assert to verify the test
	}

}
