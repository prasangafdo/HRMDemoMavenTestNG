package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyEmploymentStatus extends BackgroundWorker{
	
	@BeforeClass
	public void navigate() {
		navigateToUserManagement();
		selectEmpStatus();
	}
	
	@Test(priority=1, dataProvider="extractedEmploymentStatus", dataProviderClass=DataDriver.class)
	public void verifyAddEmploymentStatus(String EmploymentStatus) {
		System.out.println();
	//	driver.findElement(By.id("btnAdd")).click();
	}

}
