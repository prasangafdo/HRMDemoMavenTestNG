package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyQualificationSkills extends BackgroundWorker{

	@BeforeClass
	public void navigateToSkills() {
		selectSkills();
	}

	@Test(priority = 1, dataProvider ="extractedQualificationSkills", dataProviderClass = DataDriver.class)
	public void verifyAddSkill(String skill, String description) {
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("skill_name")).sendKeys(skill);
		driver.findElement(By.id("skill_description")).sendKeys(description);
		driver.findElement(By.id("btnSave")).click();
	}
	
	
}
