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
	
	@Test(priority=1)
	public void verifyAddEmploymentStatus() {
		driver.findElement(By.id("btnAdd")).click();
	}

}
