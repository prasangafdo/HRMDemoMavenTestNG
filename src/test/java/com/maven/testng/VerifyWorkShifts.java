package com.maven.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyWorkShifts extends BackgroundWorker{

	@BeforeClass
	public void navigateToWorkShifts() {
		navigateToUserManagement();
		selectWorkShifts();
	}
	
	@Test(dataProvider="extractedWorkShifts", dataProviderClass=DataDriver.class)
	public void test1(String shiftName, String hoursFrom, String hoursTo, String employee) {
		driver.findElement(By.id("btnAdd")).click();
		
		//Hard coding data for now just to verify the element locaters.
		driver.findElement(By.id("workShift_name")).sendKeys(shiftName);
		
		//Selecting work hours
		Select ddl_hoursFrom = new Select(driver.findElement(By.id("workShift_workHours_from")));
		ddl_hoursFrom.selectByValue(hoursFrom);
		
		Select ddl_hoursTo = new Select(driver.findElement(By.id("workShift_workHours_to")));
		ddl_hoursTo.selectByVisibleText(hoursTo);
		
		Select availableEmployee = new Select(driver.findElement(By.id("workShift_availableEmp")));
		availableEmployee.selectByVisibleText(employee);
		
		driver.findElement(By.xpath("//*/a[@id='btnAssignEmployee']")).click();
		
		
		///////////
		navigateToUserManagement();
		selectWorkShifts();
		
		
	}
	
	@AfterMethod
	public void aaa() {
		navigateToUserManagement();
		selectWorkShifts();
	}
	
	

}
