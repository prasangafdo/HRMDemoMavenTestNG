package com.maven.testng.function;

import com.maven.testng.page.AddUserPage;
import com.maven.testng.page.UsersPage;

public class AddUser {

	static UsersPage users = new UsersPage();
	static AddUserPage addUser = new AddUserPage();
	
	public static void clickOnAddButton() {
		users.clickOnAddButton();
	}
	public static void createUser(String UserRole, String Username, String EmployeeName, String Status,String Password) {
		addUser.createUser(UserRole,Username, EmployeeName, Status, Password);
	}
	
}
