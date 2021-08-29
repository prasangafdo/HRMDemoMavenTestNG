package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.maven.testng.BackgroundWorker;

public class UsersPage extends BackgroundWorker{
	
	private static By txtSearchUsername = By.id("searchSystemUser_userName"); //Search text field
	private static By btnsearch = By.id("searchBtn"); //Search button
	
//	public void setTextInElementWithID(String elementID, String value) {
//		driver.findElement(By.id(elementID)).sendKeys(value);
//		//sleep
//	}
	public void searchByUsername(String username) {//More parameters will be added later
		driver.findElement(txtSearchUsername).sendKeys(username);
		driver.findElement(btnsearch).click();
	}

}
