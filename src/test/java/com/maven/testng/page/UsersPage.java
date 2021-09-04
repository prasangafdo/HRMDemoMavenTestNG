package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maven.testng.BackgroundWorker;

public class UsersPage extends BackgroundWorker{
	
	private static By txtSearchUsername = By.id("searchSystemUser_userName"); //Search text field
	private static By btnsearch = By.id("searchBtn"); //Search button
	private static By drpDwnUserRole = By.id("searchSystemUser_userType");
	private static By txtEmployeeName = By.id("searchSystemUser_employeeName_empName");
	private static By drpDwnStatus = By.id("searchSystemUser_status");
	
//	public void setTextInElementWithID(String elementID, String value) {
//		driver.findElement(By.id(elementID)).sendKeys(value);
//		//sleep
//	}
	public void searchByUsername(String username) {//More parameters will be added later
		driver.findElement(txtSearchUsername).sendKeys(username);
		driver.findElement(btnsearch).click();
	}
	public void searchAdminUserByUsername(String username) {
		driver.findElement(txtSearchUsername).clear();
		driver.findElement(txtSearchUsername).sendKeys(username);
		Select select = new Select(driver.findElement(drpDwnUserRole));
		select.selectByVisibleText("Admin");
		driver.findElement(btnsearch).click();
	}
	public void searchESSUserByUsername(String username) {
		driver.findElement(txtSearchUsername).clear();
		driver.findElement(txtSearchUsername).sendKeys(username);
		Select select = new Select(driver.findElement(drpDwnUserRole));
		select.selectByVisibleText("ESS");
		driver.findElement(btnsearch).click();
	}
	public void searchByEmployeeName(String employeeName) {
		driver.findElement(txtSearchUsername).sendKeys(employeeName);
		driver.findElement(btnsearch).click();
	}
	public void searchByStatus(String status) {
		driver.findElement(txtSearchUsername).sendKeys(status);
		driver.findElement(btnsearch).click();
	}


}
