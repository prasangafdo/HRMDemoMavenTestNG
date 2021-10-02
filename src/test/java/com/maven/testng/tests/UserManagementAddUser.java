package com.maven.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.DataDriver;
import com.maven.testng.VerifyLoginTest;
import com.maven.testng.function.AddUser;

public class UserManagementAddUser extends LoginTest{

	/*
	@Test(priority = 1, dataProvider="userData", dataProviderClass = DataDriver.class)
	public void addUser(String userRole, String employeeName, String username, String status, String password) {
		driver.findElement(By.id("btnAdd")).click();
		
		Select ddlUserRole = new Select(driver.findElement(By.id("systemUser_userType")));
		ddlUserRole.selectByVisibleText(userRole);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(employeeName);
		//Wait();
		driver.findElement(By.xpath("//*///ul/li[@class='ac_even ac_over']")).click();
			
		//}
		
		/*		driver.findElement(By.id("systemUser_userName")).sendKeys(username);
		
		Select userStatus = new Select (driver.findElement(By.id("systemUser_status")));
		userStatus.selectByVisibleText(status);
		
		driver.findElement(By.id("systemUser_password")).sendKeys(password);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(password);
		
	//	Wait();
		driver.findElement(By.id("btnSave")).click();
	//	Wait();
		//Verify the url = expected = https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers
		setActualSavedSuccessMessage();
		Assert.assertEquals(getActualSavedSuccessMessage(), getExpectedSavedMessage());		

		
		//Reporter.log(employeeName);
//		
	
}
*/
	
	@Test(priority=1)
	public void testAddNewAdminUser() {
//		SoftAssert softAssert = new SoftAssert();
//		VerifyLoginTest login = new VerifyLoginTest();//Will change to static later
//		login.verifyLoginWithCorrectCredentials();
//		navigateToUserManagement();
//		AddUser.clickOnAddButton();
//		AddUser.createUser("Admin", "Username113", "Alice", "Enabled", "Password123");
//		softAssert.assertEquals(AddUser.getSaveSuccessMessage(), "Successfully Saved");
	}
	//Add a after method to delete test data
}
