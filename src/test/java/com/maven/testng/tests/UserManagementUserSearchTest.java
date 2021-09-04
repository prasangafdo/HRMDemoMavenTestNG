package com.maven.testng.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.function.SearchUser;

import com.maven.testng.BackgroundWorker;

public class UserManagementUserSearchTest extends BackgroundWorker{
	
	SearchUser searchUserFunction = new SearchUser();
	
	@Test
	public void verifyUserManagementSearch() {
		SoftAssert softAssert = new SoftAssert();
		//softAssert.
		navigateToUserManagement();
//		searchUserFunction.searchAllUsersByUsername();
//		searchUserFunction.searchAdminUsersByUsername();
//		searchUserFunction.searchESSUsersByUsername();
		searchUserFunction.searchAllUsersByEmployeeName();
		
	}

}
