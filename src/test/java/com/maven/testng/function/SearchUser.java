package com.maven.testng.function;

import com.maven.testng.page.UsersPage;

public class SearchUser{
	
	 static UsersPage users = new UsersPage();

	//Search user
	public static void searchAllUsersByUsername() {
		users.searchByUsername("Cassidy.Hopea"); //Data is hardcoded for now
		//return users.isSearchResultCheckboxDisplayed();
	}
	public static void searchAdminUsersByUsername() {
		users.searchAdminUserByUsername("Test Alice 0001");	//Linda.Anderson
	}
	public static void searchESSUsersByUsername() {
		users.searchESSUserByUsername("maricamp"); //Garry.White
		
	}
	public static void searchAllUsersByEmployeeName() {
		users.searchByEmployeeName("Alice");
	}
//	public boolean isSearchResultDisplayed() {
//		return users.isSearchResultDisplayed();
//	}
	public static boolean isNoRecordsFoundMessageDisplayed() {
		return users.getNoRecordssFoundMessage();
	}
	public static boolean isSearchResultCheckboxDisplayed() {
		return users.isSearchResultCheckboxDisplayed();
	}
	public static void searchUsersInEnabledStatus() {
		users.searchByStatus("Enabled");
	}
	public static void searchUsersInDisabledStatus() {
		users.searchByStatus("Disabled");
	}

//	public boolean isEmployeeDropDownDisplayed() {
//		return users.elementIsPresent();
//	}
	
	//End search user
	
	//Add user
	public void createAdminUserInEnabledStatus() {
		
	}
	public void createAdminUserInDisabledStatus() {
		
	}	
	public void createESSUserInEnabledStatus() {
		
	}
	public void createESSUserInDisabledStatus() {
		
	}		
	//End add user
}
