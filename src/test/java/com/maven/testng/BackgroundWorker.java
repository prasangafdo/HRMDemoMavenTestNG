/**
 * 
 */
package com.maven.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

/**
 * @author Prasanga Fernando
 *
 */

@SuppressWarnings("unused")
public class BackgroundWorker {
	static {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Prasanga Fernando/Documents/Eclipse/TestNG_PageTitle/chromedriver/chromedriver.exe");
			}
	
	  static WebDriver driver = new ChromeDriver();
	  
	  
	 
//		@BeforeTest
//		public void  getURL() {
//			 driver.get("https://opensource-demo.orangehrmlive.com/"); //Setting initial URL
//		}
//	 
	 public void navigateToUserManagement() {
		 	driver.manage().window().maximize();//Maximizing the window
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		}
		public void navigateToAddUser() {
			driver.findElement(By.id("btnAdd")).click();
		}
		

		
		public void Wait() {
			try {
				Thread.sleep(2000);
				System.out.println("Waiting 2 seconds...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void setMouseOverOnJob() {
			WebElement item = driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li[1]/ul/li[2]")); //Selenium mouse over
			Actions action = new Actions(driver);
			action.moveToElement(item).perform();
		}
		
		public void selectJobTitles() {
			setMouseOverOnJob();
			driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
			
		}
		
		public void selectPayGrades() {
			setMouseOverOnJob();
			driver.findElement(By.id("menu_admin_viewPayGrades")).click();
			
		}

		public void selectEmpStatus() {
			setMouseOverOnJob();
			driver.findElement(By.id("menu_admin_employmentStatus")).click();
			
		}
		
		public void selectJobCategories() {
			setMouseOverOnJob();
			driver.findElement(By.id("menu_admin_jobCategory")).click();
		}
		
		public void selectWorkShifts() {
			setMouseOverOnJob();
			driver.findElement(By.id("menu_admin_workShift")).click();
		}
				
		String actualResult;
		String expectedSavedMessage = "Successfully Saved";
		//Verification points
		public void setSavedSuccessMessage() {
			actualResult = driver.findElement(By.xpath("//*/form/div[@class='message success fadable']")).getText();
		//	return actualResult;
		}
		
		public String getSavedSuccessMessage() {
			return this.actualResult;
		}
		
		public String getExpectedSavedMessage() {
			return this.expectedSavedMessage;
		}

}
