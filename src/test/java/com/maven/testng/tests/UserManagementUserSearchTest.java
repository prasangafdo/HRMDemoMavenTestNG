package com.maven.testng.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.maven.testng.function.SearchUserFunction;

import com.maven.testng.BackgroundWorker;

public class UserManagementUserSearchTest extends BackgroundWorker{
	
	SearchUserFunction searchUserFunction = new SearchUserFunction();
	
	@Test
	public void verifyUserManagementSearch() {
		SoftAssert softAssert = new SoftAssert();
		//softAssert.
		navigateToUserManagement();
		searchUserFunction.searchWithUsernameAndAllUserTypes();
		
	}

}
