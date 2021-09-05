package com.maven.testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

//@SuppressWarnings("unused")
public class VerifyUserManagementPage extends BackgroundWorker{

	@BeforeClass
	public void navigate() {
		navigateToUserManagement();
	}
	
	@Test(priority = 1, dataProvider="userData", dataProviderClass = DataDriver.class)
	public void addUser(String userRole, String employeeName, String username, String status, String password) {
		driver.findElement(By.id("btnAdd")).click();
		
		Select ddlUserRole = new Select(driver.findElement(By.id("systemUser_userType")));
		ddlUserRole.selectByVisibleText(userRole);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(employeeName);
		//Wait();
		driver.findElement(By.xpath("//*/ul/li[@class='ac_even ac_over']")).click();
			
		//}
		
		driver.findElement(By.id("systemUser_userName")).sendKeys(username);
		
		Select userStatus = new Select (driver.findElement(By.id("systemUser_status")));
		userStatus.selectByVisibleText(status);
		
		driver.findElement(By.id("systemUser_password")).sendKeys(password);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(password);
		
	//	Wait();
		driver.findElement(By.id("btnSave")).click();
	//	Wait();
		//Verify the url = expected = https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers
		setActualSavedSuccessMessage();
		Assert.assertEquals(getActualSavedSuccessMessage(), getExpectedSavedMessage());		

		
		//Reporter.log(employeeName);
//		System.out.println(userData);
	}
	
//	@Test(priority=2, dataProvider="userData", dataProviderClass = DataDriver.class)
//	public void searchByUsername(String userRole, String employeeName, String username, String status, String password) {
//		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);
//		driver.findElement(By.id("searchBtn")).click();
//		
//	}

}
