/**
 * 
 */
package com.maven.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Prasanga Fernando
 * 
 * This class contains main funtionalities related to "Add job title" page
 *
 */
public class VerifyJobTitlesPage extends BackgroundWorker {
	

	@Test
	public void verifyAddUser() {
		// TODO Auto-generated method stub
		navigateToUserManagement();
		selectJobTitles();
		//Assert.assertEquals("test", "test"); //dummy assert to verify the test
		driver.findElement(By.xpath("//*/input[@name='btnAdd']")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("aaa");
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("aaa");
		driver.findElement(By.id("jobTitle_note")).sendKeys("aaa");
		driver.findElement(By.id("btnSave")).click();
		
		
	}

}
