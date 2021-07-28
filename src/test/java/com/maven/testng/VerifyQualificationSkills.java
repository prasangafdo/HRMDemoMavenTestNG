package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyQualificationSkills extends BackgroundWorker{

	@Test
	public void aaa() {
		selectSkills();
		driver.findElement(By.id("btnAdd")).click();
	}
}
