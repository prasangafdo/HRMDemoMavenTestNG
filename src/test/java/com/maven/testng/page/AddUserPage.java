package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven.testng.BackgroundWorker;

public class AddUserPage extends BackgroundWorker{
	
	private static By drpDwnUserRole = By.id("systemUser_userType");
	private static By txtEmployeeName = By.id("systemUser_employeeName_empName");
	private static By txtUsername = By.id("systemUser_userName");
	private static By lblUsername = By.xpath("//div/ul/li[@class='ac_even ac_over']");
	private static By drpDwnStatus = By.id("systemUser_status");
	private static By txtPassword = By.id("systemUser_password");
	private static By txtConfirmPassword = By.id("systemUser_confirmPassword");
	private static By btnSave = By.id("btnSave");
	private static By btnCancel = By.id("btnCancel");
	
	private static WebDriverWait wait= new WebDriverWait(driver, 10); //Explicit wait object creation
	
	public void selectUserRole(String UserRole) {
		Select selectUserRole = new Select(driver.findElement(drpDwnUserRole));
		selectUserRole.selectByVisibleText(UserRole);
	}
	public void selectEmployeeName(String EmployeeName) {
		driver.findElement(txtEmployeeName).sendKeys(EmployeeName);
		WebElement elementlblnEmployeeName; //Explicit wait
		elementlblnEmployeeName= wait.until(ExpectedConditions.visibilityOfElementLocated(lblUsername));
		elementlblnEmployeeName.click();
	}
}
