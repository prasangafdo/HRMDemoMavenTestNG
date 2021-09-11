package com.maven.testng.function;

import com.maven.testng.page.UsersPage;

public class AddUser {

	static UsersPage users = new UsersPage();
	
	public void clickOnAddButton() {
		users.clickOnAddButton();
	}
	
}
