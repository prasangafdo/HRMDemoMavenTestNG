/**
 * 
 */
package com.maven.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Prasanga Fernando
 * 
 * This class contains main functionalities related to "Add job title" page
 *
 */
public class VerifyJobTitlesPage extends BackgroundWorker {
	

	@Test(dataProvider="jobTitle", dataProviderClass = DataDriver.class , enabled=true)
	public void verifyAddJobTitle(String jobTitle, String jobDescription, String jobNote) {
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
	
	@Test(priority = 2, dataProvider="extractedEditedJobTitles", dataProviderClass = DataDriver.class)
	public void verifyEditJobTitle(String existingJobName, String newJobName, String jobDescription, String jobTitleNote) {//Add other data here and convert this to a TestNG test case
		
		navigateToUserManagement();
		selectJobTitles();

		WebElement element_ExistingJobName = driver.findElement(By.xpath("//*/tbody/tr/td/a[contains(text(),'"+existingJobName+"')]"));
		element_ExistingJobName.click(); //Clicking on the existing job title to view more details.
		
		driver.findElement(By.id("btnSave")).click();//Clicking on the edit button after opening the view of the selected job title.
		
		WebElement element_jobTitle_jobTitle = driver.findElement(By.id("jobTitle_jobTitle"));
		WebElement element_jobTitle_jobDescription = driver.findElement(By.id("jobTitle_jobDescription"));
		WebElement element_jobTitle_note = driver.findElement(By.id("jobTitle_note"));
		
		//Removing existing values
		element_jobTitle_jobTitle.clear();
		element_jobTitle_jobDescription.clear();
		element_jobTitle_note.clear();
		
		//Sending new values
		element_jobTitle_jobTitle.sendKeys(newJobName);
		element_jobTitle_jobDescription.sendKeys(jobDescription);
		element_jobTitle_note.sendKeys(jobTitleNote);
		
		driver.findElement(By.id("btnSave")).click();//Saving the updated details
		
				
		String expectedMessage = "Successfully Updated";
		String actualMessage = driver.findElement(By.xpath("//*/div[@class ='message success fadable']")).getText();
		
		Assert.assertEquals(actualMessage, expectedMessage);

	}
	

}
