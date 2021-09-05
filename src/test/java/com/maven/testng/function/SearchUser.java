package com.maven.testng.function;

import com.maven.testng.page.UsersPage;

public class SearchUser{
	
	static UsersPage users = new UsersPage();

	public void searchAllUsersByUsername() {
		users.searchByUsername("Cassidy.Hopea"); //Data is hardcoded for now
		//return users.isSearchResultCheckboxDisplayed();
	}
	public void searchAdminUsersByUsername() {
		users.searchAdminUserByUsername("Linda.Anderson");
	}
	public void searchESSUsersByUsername() {
		users.searchESSUserByUsername("Garry.White");
		
	}
	public void searchAllUsersByEmployeeName() {
		users.searchByEmployeeName("Pakada");
	}
//	public boolean isSearchResultDisplayed() {
//		return users.isSearchResultDisplayed();
//	}
	public boolean isNoRecordsFoundMessageDisplayed() {
		return users.getNoRecordssFoundMessage();
	}
	public boolean isSearchResultCheckboxDisplayed() {
		return users.isSearchResultCheckboxDisplayed();
	}
	public void searchUsersInEnabledStatus() {
		users.searchByStatus("Enabled");
	}
	public void searchUsersInDisabledStatus() {
		users.searchByStatus("Disabled");
	}
	
//	public boolean isEmployeeDropDownDisplayed() {
//		return users.elementIsPresent();
//	}
	
	
}
