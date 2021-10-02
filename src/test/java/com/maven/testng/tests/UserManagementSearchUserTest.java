package com.maven.testng.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.function.Landing;
import com.maven.testng.function.Login;
import com.maven.testng.function.SearchUser;
import com.maven.testng.util.BrowserManager;
import com.maven.testng.BackgroundWorker;
import com.maven.testng.VerifyLoginTest;

public class UserManagementSearchUserTest extends BrowserManager{
	
//	SearchUser searchUserFunction = new SearchUser();

	public static LoginTest login = new LoginTest();
	
	@Test(priority=1)
	public void verifyuserCanSearchAnyUsersByUsername() {
		SoftAssert softAssert = new SoftAssert();
		login.verifyLoginAsValidUser();
		Landing.maximizeBrowser();
		Landing.navigateToAdmin();

		SearchUser.searchAllUsersByUsername();//Change these functions later
		try{
			softAssert.assertTrue(SearchUser.isSearchResultCheckboxDisplayed());
		}
		catch(Exception e) {
			softAssert.assertTrue(SearchUser.isNoRecordsFoundMessageDisplayed());
			Reporter.log("No records found");
		}

//		Login.logout();
		softAssert.assertAll();
		endSession();
		
	}
	@Test(priority=2)
	public void verifyuserCanSearchESSUsersByUsername() {
		SoftAssert softAssert = new SoftAssert();
		login.verifyLoginAsValidUser();
		Landing.maximizeBrowser();
		Landing.navigateToAdmin();

		SearchUser.searchESSUsersByUsername();//Change these functions later
		try{
			softAssert.assertTrue(SearchUser.isSearchResultCheckboxDisplayed());
		}
		catch(Exception e) {
			softAssert.assertTrue(SearchUser.isNoRecordsFoundMessageDisplayed());
			Reporter.log("No records found");
		}

	//	Login.logout();
		softAssert.assertAll();
		endSession();
	}
	
	
	@Test(priority=3)
	public void verifyuserCanSearchAllUsersByEmployeeName() {
		SoftAssert softAssert = new SoftAssert();
		login.verifyLoginAsValidUser();
		Landing.maximizeBrowser();
		Landing.navigateToAdmin();

		SearchUser.searchAllUsersByEmployeeName();//Change these functions later
		try{
			softAssert.assertTrue(SearchUser.isSearchResultCheckboxDisplayed());
		}
		catch(Exception e) {
			softAssert.assertTrue(SearchUser.isNoRecordsFoundMessageDisplayed());
			Reporter.log("No records found");
		}

		//Login.logout();
		softAssert.assertAll();
		endSession();
		
	}	
	/*
	@Test(priority=3)
	public void verifyuserCanSearchUsersByStatus() {
		SoftAssert softAssert = new SoftAssert();
		login.verifyLoginAsValidUser();
		Landing.maximizeBrowser();
		Landing.navigateToAdmin();

		try{
			SearchUser.searchUsersInDisabledStatus();//Change these functions later
			softAssert.assertTrue(SearchUser.isSearchResultCheckboxDisplayed());
		}
		catch(Exception e) {
			softAssert.assertTrue(SearchUser.isNoRecordsFoundMessageDisplayed());
			Reporter.log("No records found");
		}
		try{
			SearchUser.searchUsersInEnabledStatus();//Change these functions later
			softAssert.assertTrue(SearchUser.isSearchResultCheckboxDisplayed());
		}
		catch(Exception e) {
			softAssert.assertTrue(SearchUser.isNoRecordsFoundMessageDisplayed());
			Reporter.log("No records found");
		}

		Login.logout();
		softAssert.assertAll();
		
	}	*/

}
