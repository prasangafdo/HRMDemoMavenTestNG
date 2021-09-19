package com.maven.testng.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.function.SearchUser;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.VerifyLoginTest;

public class UserManagemenSearchUserTest extends VerifyLoginTest{
	
	SearchUser searchUserFunction = new SearchUser();

	
/*	@Test(priority=1)
	public void verifyuserCanSearchAllUsersByUsername() {
		SoftAssert softAssert = new SoftAssert();
		navigateToUserManagement();
		searchUserFunction.searchAllUsersByUsername();
		Reporter.log("verifyuserCanSearch");
	//	softAssert.assertTrue(searchUserFunction.isSearchResultDisplayed());
		try {
			softAssert.assertEquals(searchUserFunction.isSearchResultDisplayed(), true);
		}
		catch(Exception e) {
			Reporter.log(e.toString());
			softAssert.assertFalse((searchUserFunction.isNoRecordsFoundMessageDisplayed()));//Using assert false to handle exceptions and soft assertion
		}
		
	//	softAssert.assertTrue(false);
		//searchUserFunction.searchAdminUsersByUsername();
		//searchUserFunction.searchESSUsersByUsername();
		Reporter.log("verifyuserCanSearchAllUsersByUsername");
		softAssert.assertAll();
	}
	
*/
	@Test(priority=1)
	public void verifyuserCanSearchAllUsersByUsername() {
		SoftAssert softAssert = new SoftAssert();
		verifyLoginWithCorrectCredentials();
		navigateToUserManagement();
		searchUserFunction.searchAllUsersByUsername();
		try{
			softAssert.assertTrue(searchUserFunction.isSearchResultCheckboxDisplayed());
		}
		catch(Exception e) {
			softAssert.assertTrue(searchUserFunction.isNoRecordsFoundMessageDisplayed());
			Reporter.log("No records found");
		}
		
	//	Reporter.log("verifyuserCanSearchaaaaaaaaaaaaaaa");
		softAssert.assertAll();
		
	}
	
	
	@Test(priority=2)
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

}
