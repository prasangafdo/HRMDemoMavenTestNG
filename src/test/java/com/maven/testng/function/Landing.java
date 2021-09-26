package com.maven.testng.function;

import org.openqa.selenium.By;

import com.maven.testng.page.LandingPage;

public class Landing {
	public static LandingPage landing = new LandingPage();
	
	public static void maximizeBrowser() {
		landing.maximizeBrowser();
	}
	public static void navigateToUsersPage() {
		landing.navigateToUsersPage();
	}
	public static void navigateToAddUser() {
		landing.navigateToUsersPage();
	}
}
