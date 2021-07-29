package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyQualificationSkills extends BackgroundWorker{

//	@BeforeClass
//	public void navigateToSkills() {
//		selectSkills();
//	}
//	@Test
//	public void verifyAddSkill() {
//		
//		driver.findElement(By.id("btnAdd")).click();
//		
//		driver.findElement(By.id("skill_name")).sendKeys("TestSkill0001");
//		driver.findElement(By.id("skill_description")).sendKeys("Test Skill Description 0001");
//		driver.findElement(By.id("btnSave")).click();
//	}
	
	@Test(dataProvider ="extractedQualificationSkills", dataProviderClass = DataDriver.class)
	public void dd(String a, String b) {
		
	}
}
