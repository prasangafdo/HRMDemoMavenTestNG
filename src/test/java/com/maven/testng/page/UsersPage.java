package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.util.BrowserManager;

public class UsersPage extends BrowserManager{
	
	private static By txtSearchUsername = By.id("searchSystemUser_userName"); //Search text field
	private static By btnsearch = By.id("searchBtn"); //Search button
	private static By drpDwnUserRole = By.id("searchSystemUser_userType");
	private static By txtEmployeeName = By.name("searchSystemUser[employeeName][empName]");
	private static By drpDwnStatus = By.id("searchSystemUser_status");
	private static By drpDwnEmployeeName = By.xpath("//ul/li[@class='ac_even ac_over']"); //This element is a ul element.
	//private static By lblSearchResult = By.xpath("//td/a[text()='Garry.White']"); //Change this later
	private static By lblSearchResult = By.name("chkSelectRow[]");//Change variable name later
	private static By lblNoRecordsFound = By.xpath("//td[text()='No Records Found']");
	
	public static By drpDwnEmployeeNameList = By.xpath("//div[@class=\"ac_results\"]");
	private static By btnAdd = By.id("btnAdd");
	
//	private static String expectedSearchResult;
	
	private static WebDriverWait wait= new WebDriverWait(driver, 10); //Explicit wait object creation

	

	public void searchByUsername(String username) {//More parameters will be added later
		driver.findElement(txtSearchUsername).sendKeys(username);
		driver.findElement(btnsearch).click();
	}
	public void searchAdminUserByUsername(String username) {
	//	driver.findElement(txtSearchUsername).clear();
		clearAllValues();
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
		clearAllValues();
		driver.findElement(txtEmployeeName).sendKeys(employeeName);

		WebElement elementdrpDwnEmployeeName; //Explicit wait
		elementdrpDwnEmployeeName= wait.until(ExpectedConditions.visibilityOfElementLocated(drpDwnEmployeeName));
		elementdrpDwnEmployeeName.click();
		
		driver.findElement(btnsearch).click();
	}
	public void searchByStatus(String status) {
		clearAllValues();
		Select selectStatus = new Select(driver.findElement(drpDwnStatus));
		selectStatus.selectByVisibleText(status);
		driver.findElement(btnsearch).click();
	}
	
	public boolean isSearchResultCheckboxDisplayed() {
		return driver.findElement(lblSearchResult).isDisplayed();
		//String aaa = driver.findElement(lblSearchResult).getText();
	}
	public boolean getNoRecordssFoundMessage() {
		return driver.findElement(lblNoRecordsFound).isDisplayed();
	}
	public void clearAllValues() {
		driver.findElement(txtSearchUsername).clear();
		driver.findElement(txtEmployeeName).clear();
		Select selectUserRole = new Select(driver.findElement(drpDwnUserRole));
		selectUserRole.selectByIndex(0);
	}
	public void clickOnAddButton() {
		driver.findElement(btnAdd).click();
	}
	
//	public boolean elementIsPresent() {
//		 Boolean isPresent = driver.findElements(drpDwnEmployeeNameList).size() > 0;
//		 return isPresent;
//	}


}
