package com.maven.testng.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.function.SearchUser;

import com.maven.testng.BackgroundWorker;

public class UserManagementUserSearchTest extends BackgroundWorker{
	
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
		navigateToUserManagement();
		//searchUserFunction.searchAllUsersByUsername();
	//	Reporter.log("verifyuserCanSearch");
		//searchUserFunction.searchAllUsersByUsername();
		try{
			softAssert.assertTrue(searchUserFunction.searchAllUsersByUsername());
		}
		catch(Exception e) {
			softAssert.assertTrue(searchUserFunction.isNoRecordsFoundMessageDisplayed());
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
		softAssert.assertTrue(searchUserFunction.isSearchResultDisplayed());
	//	searchUserFunction.searchAdminUsersByUsername();

		Reporter.log("AAA");
		softAssert.assertAll();
	}
	
	*/
	
//	@Test
//	public void assertTest() {
//		SoftAssert softAssert = new SoftAssert();
//		//softAssert.assertEquals(true, false);
//		softAssert.assertTrue(false);
//		Reporter.log("Soft ass failed");
//		softAssert.assertAll();
//	}
	
	
	/*
	 * 		searchUserFunction.searchAdminUsersByUsername();
		softAssert.assertTrue(searchUserFunction.isSearchResultDisplayed(), "Result is incorrect");
		searchUserFunction.searchESSUsersByUsername();
		softAssert.assertTrue(searchUserFunction.isSearchResultDisplayed(), "Result is incorrect");
		searchUserFunction.searchAllUsersByEmployeeName();
		softAssert.assertTrue(searchUserFunction.isSearchResultDisplayed(), "Result is incorrect");
	 */

}
