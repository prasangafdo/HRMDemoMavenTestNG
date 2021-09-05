package com.maven.testng.function;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.page.UsersPage;

public class SearchUser{
	
	static UsersPage users = new UsersPage();

	public boolean searchAllUsersByUsername() {
		users.searchByUsername("Cassidy.Hope"); //Data is hardcoded for now
		return users.isSearchResultCheckboxDisplayed();
	}
	public void searchAdminUsersByUsername() {
		users.searchAdminUserByUsername("Linda.Anderson");
	}
	public void searchESSUsersByUsername() {
		users.searchESSUserByUsername("Garry.White");
	}
	public void searchAllUsersByEmployeeName() {
		users.searchByEmployeeName("Cecil");
	}
//	public boolean isSearchResultDisplayed() {
//		return users.isSearchResultDisplayed();
//	}
	public boolean isNoRecordsFoundMessageDisplayed() {
		return users.getNoRecordssFoundMessage();
	}
//	public boolean isSearchResultCheckboxDisplayed() {
//		return users.isSearchResultCheckboxDisplayed();
//	}
	
}
