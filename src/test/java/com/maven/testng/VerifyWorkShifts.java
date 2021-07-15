package com.maven.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyWorkShifts extends BackgroundWorker{

	@BeforeClass
	public void navigateToWorkShifts() {
		navigateToUserManagement();
		selectWorkShifts();
	}
	
	@Test
	public void test1() {
		driver.findElement(By.id("btnAdd")).click();
		
		//Hardcoding data for now just to verify the element locaters.
		driver.findElement(By.id("workShift_name")).sendKeys("Test1");
		
		//Selecting work hours
		Select hoursFrom = new Select(driver.findElement(By.id("workShift_workHours_from")));
		hoursFrom.selectByValue("10:00");
		
		Select hoursTo = new Select(driver.findElement(By.id("workShift_workHours_to")));
		hoursTo.selectByVisibleText("18:00");
		
		Select availableEmployee = new Select(driver.findElement(By.id("workShift_availableEmp")));
		availableEmployee.selectByVisibleText("Fiona Grace");
		
		driver.findElement(By.xpath("//*/a[@id='btnAssignEmployee']")).click();
		
		
	}
	

}
