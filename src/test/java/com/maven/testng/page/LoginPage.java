package com.maven.testng.page;

import org.openqa.selenium.By;

import com.maven.testng.BackgroundWorker;

public class LoginPage extends BackgroundWorker{
	
	private final By txtUsername = By.id("txtUsername");
	private final By txtPassword = By.id("txtPassword");
	private final By btnLogin = By.name("Submit");
	private final By lblInvalidCredentials = By.id("spanMessage");
	

}
