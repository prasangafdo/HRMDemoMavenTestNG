package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven.testng.BackgroundWorker;

public class UsersPage extends BackgroundWorker{
	
	private static By txtSearchUsername = By.id("searchSystemUser_userName"); //Search text field
	private static By btnsearch = By.id("searchBtn"); //Search button
	private static By drpDwnUserRole = By.id("searchSystemUser_userType");
	private static By txtEmployeeName = By.name("searchSystemUser[employeeName][empName]");
	private static By drpDwnStatus = By.id("searchSystemUser_status");
	private static By drpDwnEmployeeName = By.xpath("//ul/li[@class='ac_even ac_over']"); //This element is a ul element.
	//private static By lblSearchResult = By.xpath("//td/a[text()='Garry.White']"); //Change this later
	private static By lblSearchResult = By.name("chkSelectRow[]");//Change variable name later
	private static By lblNoRecordsFound = By.xpath("//td[text()='No Records Found']");
	
	private static String expectedSearchResult;
	
	private static WebDriverWait wait= new WebDriverWait(driver, 20); //Explicit wait object creation

	

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
		driver.findElement(txtSearchUsername).clear();
		driver.findElement(txtEmployeeName).sendKeys(employeeName);

		WebElement elementdrpDwnEmployeeName; //Explicit wait
		elementdrpDwnEmployeeName= wait.until(ExpectedConditions.visibilityOfElementLocated(drpDwnEmployeeName));
		elementdrpDwnEmployeeName.click();
		
		driver.findElement(btnsearch).click();
	}
	public void searchByStatus(String status) {
		driver.findElement(txtSearchUsername).sendKeys(status);
		driver.findElement(btnsearch).click();
	}
	
	public boolean isSearchResultCheckboxDisplayed() {
		
		return driver.findElement(lblSearchResult).isDisplayed();
		//String aaa = driver.findElement(lblSearchResult).getText();
	}
	
	public boolean getNoRecordssFoundMessage() {
		return driver.findElement(lblNoRecordsFound).isDisplayed();
	}


}
