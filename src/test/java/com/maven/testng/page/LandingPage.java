package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maven.testng.util.BrowserManager;

public class LandingPage extends BrowserManager{
	
private By navAdmin = By.id("menu_admin_viewAdminModule");
private By navUserManagement = By.id("menu_admin_UserManagement");
private By navUsers = By.xpath("//li/a[text()='Users']/../..");

	
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();//Maximizing the window
	}
	public void navigateToAdmin() {
		driver.findElement(navAdmin).click();
	}
	public void navigateToUsersPage() {
		driver.findElement(navUserManagement).click();
			WebElement item = driver.findElement(navUserManagement);
			Actions action = new Actions(driver);
			action.moveToElement(item).perform();
			driver.findElement(navUserManagement).click();
		}
	public void navigateToAddUser() {
		driver.findElement(By.id("btnAdd")).click();
	}
	
	/*

		public void sleep(int miliSeconds) {
			try {
				Thread.sleep(miliSeconds);
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
		
		public void mouseOverOnOrganization() {
			navigateToUserManagement();
			WebElement element = driver.findElement(By.id("menu_admin_Organization"));
			Actions hoverOnOrganizations = new Actions(driver);
			sleep(1000);//Waiting a few seconds to sync up with browser loading speed
			hoverOnOrganizations.moveToElement(element).perform();
		}
		
		public void selectLocations() {
			mouseOverOnOrganization();
			driver.findElement(By.id("menu_admin_viewLocations")).click();
		}
		
		public void mouseOverOnQualifications() {
			navigateToUserManagement();
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li/ul/li/a[@id='menu_admin_Qualifications']"))).build().perform();
		}
		
		public void selectSkills() {
			mouseOverOnQualifications();
			driver.findElement(By.id("menu_admin_viewSkills")).click();
		}
		
		public void selectEducation() {
			mouseOverOnQualifications();
			driver.findElement(By.id("menu_admin_viewEducation")).click();
		}
		public void selectLicense() {
			mouseOverOnQualifications();
			driver.findElement(By.id("menu_admin_viewLicenses")).click();
		}	
		public void selectLanguages() {
			mouseOverOnQualifications();
			driver.findElement(By.id("menu_admin_viewLanguages")).click();
		}	
		public void selectMemberships() {
			mouseOverOnQualifications();
			driver.findElement(By.id("menu_admin_membership")).click();
		}	
		
		*/
		
		//=====================Verification Messages=============================//
				
		String actualResult;
		String expectedSavedMessage = "Successfully Saved";
		//Verification points
		public void setActualSavedSuccessMessage() {
			actualResult = driver.findElement(By.xpath("//*///div[@class='message success fadable']")).getText(); //Changed from //*/form/div[@class='message success fadable'] due to locating issue un Skills page.
		//	return actualResult;
		}
		
		public String getActualSavedSuccessMessage() {
			return this.actualResult;
		}
		
		public String getExpectedSavedMessage() {
			return this.expectedSavedMessage;
		}

}
