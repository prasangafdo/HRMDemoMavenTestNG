package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyQualificationEducation extends BackgroundWorker{

	@BeforeClass
	public void navigateToEducation() {
		selectEducation();
	}
	
	@Test()
	public void verifyAddEducation() {//Rename the method name later
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("education_name")).sendKeys("11");
		driver.findElement(By.id("btnSave")).click();
		
	}
	
//	@Test
//	public void verifyAddSkill() {
//		
//		driver.findElement(By.id("btnAdd")).click();
//		
//		driver.findElement(By.id("skill_name")).sendKeys("TestSkill0001");
//		driver.findElement(By.id("skill_description")).sendKeys("Test Skill Description 0001");
//		driver.findElement(By.id("btnSave")).click();
//	}
//	
//	@Test(priority = 1, dataProvider ="extractedQualificationSkills", dataProviderClass = DataDriver.class)
//	public void verifyAddSkill(String skill, String description) {
//		driver.findElement(By.id("btnAdd")).click();
//		
//		driver.findElement(By.id("skill_name")).sendKeys(skill);
//		driver.findElement(By.id("skill_description")).sendKeys(description);
//		driver.findElement(By.id("btnSave")).click();
//	}
}
