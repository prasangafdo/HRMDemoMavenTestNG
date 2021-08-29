package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.maven.testng.BackgroundWorker;

public class UsersPage extends BackgroundWorker{
	
	private static By txtsearchSystemUser_userName = By.id("btnAdd"); //Search text field
	private static By btnsearchBtn = By.id("btnAdd"); //Search button
	
	public void setTextInElementWithID(String elementID, String value) {
		
	}

}
