package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyQualificationLanguages extends BackgroundWorker{

	@BeforeClass
	public void navigate() {
		selectLanguages();
	}
	
	@Test
	public void VerifyAddLanguage() {//Since this test case has only one input field, I'm not going to use a data provider to test with different data.
		driver.findElement(By.id("btnAdd")).click();
	}
}
