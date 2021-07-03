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
	

	@Test(dataProvider="jobTitle", dataProviderClass = DataDriver.class)
	public void verifyAA(String jobTitle, String jobDescription, String jobNote) {
		// TODO Auto-generated method stub
		
		navigateToUserManagement();
		selectJobTitles();
		//Assert.assertEquals("test", "test"); //dummy assert to verify the test
		
		
		driver.findElement(By.xpath("//*/input[@name='btnAdd']")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(jobTitle);
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(jobDescription);
		driver.findElement(By.id("jobTitle_note")).sendKeys(jobNote);
		driver.findElement(By.id("btnSave")).click();
		
		String expectedMessage = "Successfully Saved";
		String actualMessage = driver.findElement(By.xpath("//*/div[@class ='message success fadable']")).getText();
		
		Assert.assertEquals(actualMessage, expectedMessage);
		
	}

}
