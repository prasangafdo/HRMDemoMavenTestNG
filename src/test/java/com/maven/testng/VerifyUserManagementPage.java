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

@SuppressWarnings("unused")
public class VerifyUserManagementPage extends BackgroundWorker{

	@BeforeClass
	public void navigate() {
		navigateToUserManagement();
	}
	
	@Test(dataProvider="userData", dataProviderClass = DataDriver.class)
	public void addUser(String userRole, String employeeName, String username, String status, String password) {
		driver.findElement(By.id("btnAdd")).click();
		
		Select ddlUserRole = new Select(driver.findElement(By.id("systemUser_userType")));
		ddlUserRole.selectByVisibleText(userRole);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(employeeName);
		
		try{
			Thread.sleep(500);
			driver.findElement(By.xpath("//*/ul/li[@class='ac_even ac_over']")).click();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		driver.findElement(By.id("systemUser_userName")).sendKeys(username);
		
		Select userStatus = new Select (driver.findElement(By.id("systemUser_status")));
		userStatus.selectByVisibleText(status);
		
		driver.findElement(By.id("systemUser_password")).sendKeys(password);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(password);
		
		
		try{
			Thread.sleep(500);
			driver.findElement(By.name("btnSave")).click();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		//Reporter.log(employeeName);
//		System.out.println(userData);
	}

}
