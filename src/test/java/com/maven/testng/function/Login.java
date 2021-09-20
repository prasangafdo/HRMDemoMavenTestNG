package com.maven.testng.function;

import com.maven.testng.page.LoginPage;

public class Login {

	private static LoginPage login = new LoginPage();
	
	
	public static void verifyLoginAsValidUser() {
		login.enterCredentials("Admin", "admin123");
		login.clickOnLoginButton();
	}
	public static void verifyLoginAsInvalidUser() {
		login.enterCredentials("Admin2", "adminaaaa123");
		login.clickOnLoginButton();
	}
	public static String getExpectedURL() {
		return login.getExpectedURL();
	}
	public static String getCurrentURL() {
		return login.getcurrentURL();
	}
	public static void logout() {
		login.logout();
	}
	public static String getInvalidLoginErrorMessage() {
		return login.getInvalidCredentialsMessage();
	}
	
}
