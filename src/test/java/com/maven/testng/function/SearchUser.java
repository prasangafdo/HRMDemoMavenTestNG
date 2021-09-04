package com.maven.testng.function;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.page.UsersPage;

public class SearchUser extends BackgroundWorker{
	
	static UsersPage users = new UsersPage();

	public void searchWithUsernameAndAllUserTypes() {
		users.searchByUsername("Cassidy.Hope"); //Data is hardcoded for now
	}
	public void searchWithUsernameAndAdminUserType() {
		
	}
	public void searchWithUsernameAndESSUserType() {
		
	}
	
}
