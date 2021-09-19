package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.maven.testng.BackgroundWorker;

public class LoginPage extends BackgroundWorker{//Make this page POM later
	
	private final By txtUsername = By.id("txtUsername");
	private final By txtPassword = By.id("txtPassword");
	private final By btnLogin = By.name("Submit");
	private final By lblInvalidCredentials = By.id("spanMessage");
	private final By lblWelcome = By.id("welcome");
	private final By lnkLogout = By.xpath("//li/a[text()='Logout']");
	private String Username, Password;
	
	private static WebDriverWait wait= new WebDriverWait(driver, 10); //Explicit wait object creation
	
	@Test(priority=2)
	public void verifyLoginWithCorrectCredentials() {
		SoftAssert softAssert = new SoftAssert();
		Username  = "Admin";
		Password = "admin123";//Entering correct credentials for a successful login

		// driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(txtUsername).sendKeys(Username);
		driver.findElement(txtPassword).sendKeys(Password);
		driver.findElement(btnLogin).click();

		String expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actual =driver.getCurrentUrl();
		softAssert.assertEquals(actual, expected);
		driver.findElement(lblWelcome).click();
		WebElement elementlnkLogoute; //Explicit wait
		elementlnkLogoute= wait.until(ExpectedConditions.visibilityOfElementLocated(lnkLogout));
		elementlnkLogoute.click();
		//driver.findElement(By.xpath("//li/a[text()='Logout']")).click(); //Add a separate method for logout later
		softAssert.assertAll();
	}

//	@Test(priority=1)
//	public void verifyLoginErrorMessage() {
//
//		driver.findElement(By.id("txtUsername")).sendKeys(Username);
//		driver.findElement(By.id("txtPassword")).sendKeys(Password);	
//		driver.findElement(By.name("Submit")).click();
//
//		String errorMessage = driver.findElement(By.id("spanMessage")).getText();			
//		Assert.assertEquals(errorMessage, "Invalid credentials");
//	}

}
