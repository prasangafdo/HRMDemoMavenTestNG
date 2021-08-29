package com.maven.testng.function;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.page.UsersPage;

public class SearchUserFunction extends BackgroundWorker{
	
	static UsersPage usersPage = new UsersPage();

	public void searchWithUsernameAndAllUserTypes() {
		usersPage.searchByUsername("aaaa"); //Data is hardcoded for now
	}
	public void searchWithUsernameAndAdminUserType() {
		
	}
	public void searchWithUsernameAndESSUserType() {
		
	}
	
}
