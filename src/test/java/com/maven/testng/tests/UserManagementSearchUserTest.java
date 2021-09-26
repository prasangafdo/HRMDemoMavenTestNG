package com.maven.testng.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.function.Landing;
import com.maven.testng.function.SearchUser;
import com.maven.testng.util.BrowserManager;
import com.maven.testng.BackgroundWorker;
import com.maven.testng.VerifyLoginTest;

public class UserManagementSearchUserTest extends LoginTest{
	
//	SearchUser searchUserFunction = new SearchUser();

	@BeforeMethod
	public void beforeMethod() {

	}
	
	@Test(priority=1)
	public void verifyuserCanSearchAllUsersByUsername() {
		verifyLoginAsValidUser();
		Landing.maximizeBrowser();
		Landing.navigateToUsersPage();
		SoftAssert softAssert = new SoftAssert();
		Landing.navigateToAddUser();
		
//		searchUserFunction.searchAllUsersByUsername();//Change these functions later
		try{
//			softAssert.assertTrue(searchUserFunction.isSearchResultCheckboxDisplayed());
		}
		catch(Exception e) {
//			softAssert.assertTrue(searchUserFunction.isNoRecordsFoundMessageDisplayed());
			Reporter.log("No records found");
		}
		
	//	Reporter.log("verifyuserCanSearchaaaaaaaaaaaaaaa");
		softAssert.assertAll();
		
	}
	
	
/*	@Test(priority=2)
	public void verifyuserCanSearchESSUsersByUsername() {
		SoftAssert softAssert = new SoftAssert();
		navigateToUserManagement();
	//	searchUserFunction.searchAdminUsersByUsername();
		searchUserFunction.searchESSUsersByUsername();		
		try{
			softAssert.assertTrue(searchUserFunction.isSearchResultCheckboxDisplayed());
		}
		catch(Exception e) {
			softAssert.assertTrue(searchUserFunction.isNoRecordsFoundMessageDisplayed());
			Reporter.log("No records found");
		}
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void verifyuserCanSearchAllUsersByEmployeeName() {
		SoftAssert softAssert = new SoftAssert();
		navigateToUserManagement();
		searchUserFunction.searchAllUsersByEmployeeName();		
		softAssert.assertTrue(searchUserFunction.isSearchResultCheckboxDisplayed());
		softAssert.assertAll();
	}	
	
	@Test(priority=3)
	public void verifyuserCanSearchUsersByStatus() {
		SoftAssert softAssert = new SoftAssert();
		navigateToUserManagement();
		searchUserFunction.searchUsersInEnabledStatus();
		softAssert.assertTrue(searchUserFunction.isSearchResultCheckboxDisplayed());
		searchUserFunction.searchUsersInDisabledStatus();
		softAssert.assertTrue(searchUserFunction.isSearchResultCheckboxDisplayed());
		Reporter.log("UsersByStatus");
		softAssert.assertAll();
	}	
*/
}
