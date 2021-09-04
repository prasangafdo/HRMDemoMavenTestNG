package com.maven.testng.function;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.page.UsersPage;

public class SearchUser{
	
	static UsersPage users = new UsersPage();

	public void searchAllUsersByUsername() {
		users.searchByUsername("Cassidy.Hope"); //Data is hardcoded for now
	}
	public void searchAdminUsersByUsername() {
		users.searchAdminUserByUsername("Linda.Anderson");
	}
	public void searchESSUsersByUsername() {
		users.searchESSUserByUsername("Garry.White");
	}
	
}
