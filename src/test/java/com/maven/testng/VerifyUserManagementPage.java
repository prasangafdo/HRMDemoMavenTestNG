package com.maven.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyUserManagementPage extends BackgroundWorker{
	
	private String EmployeeName, Username, Password, userType, userStatus;
	
	public void setUser(String EmployeeName, String UserName, String Password) {
		this.EmployeeName = EmployeeName;
		this.Username = UserName;
		this.Password = Password;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getUserType() {
		Select ddlUserType = new Select(driver.findElement(By.id("systemUser_userType")));
		ddlUserType.selectByVisibleText(userType);
		return userType;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	public String getUserStatus() {
		Select ddlUserType = new Select(driver.findElement(By.id("systemUser_status")));
		ddlUserType.selectByVisibleText(userStatus);
		return userStatus;
	}
	
	public String addUser() {
		String objective = "Verify the user can add another "+userType;
		String status = null;
		getUserType();//Selecting user type in drop down list
		getUserStatus();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(EmployeeName);
		
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/ul")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

		driver.findElement(By.id("systemUser_userName")).sendKeys(Username);
		driver.findElement(By.id("systemUser_password")).sendKeys(Password);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(Password);
		
		
		try {
			Thread.sleep(2000);
			//driver.findElement(By.name("btnSave")).click();
			status = objective.concat(" Pass");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
		
		
	}
	
	@BeforeTest
	public void  getURL() {
		VerifyLoginTest login =  new VerifyLoginTest();
		login.getURL();
		login.verifyLoginWithCorrectCredentials();
	}
	
	@Test (priority = 1)
	public void  verifyAddUserAdmin() {
		navigateToUserManagement();
		navigateToAddUser();
		setUserType("Admin");//Selecting admin from user role drop down
		setUserStatus("Enabled");
		setUser("Alice", "UserName", "Password");
		//Reporter.log(getUserType());
		
		addUser();
	}
	
	@Test (priority = 2)
	public void  verifyAddUserESS() {
		navigateToUserManagement();
		navigateToAddUser();
		setUserType("ESS");//Selecting admin from user role drop down
		setUserStatus("Enabled");
		setUser("Joko", "UserName", "Password");
		//Reporter.log(getUserType());
		
		addUser();
	}
	

	
	


}
