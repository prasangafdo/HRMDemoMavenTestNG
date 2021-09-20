package com.maven.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven.testng.BackgroundWorker;
import com.maven.testng.util.BrowserManager;

public class LoginPage extends BrowserManager{//Make this page POM later
	
	private final By txtUsername = By.id("txtUsername");
	private final By txtPassword = By.id("txtPassword");
	private final By btnLogin = By.name("Submit");
	private final By lblInvalidCredentials = By.id("spanMessage");
	private final By lblWelcome = By.id("welcome");
	private final By lnkLogout = By.xpath("//li/a[text()='Logout']");
	//private String Username, Password;
	private final String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	
	
	
	private WebDriverWait wait= new WebDriverWait(driver, 10); //Explicit wait object creation
	//@Test(priority=2)
//	public void verifyLoginWithCorrectCredentials() {
	//	SoftAssert softAssert = new SoftAssert();
	//	Username  = "Admin";
	//	Password = "admin123";//Entering correct credentials for a successful login

		// driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		
//
//		
//		String actual =
//		softAssert.assertEquals(actual, expected);
//
//		softAssert.assertAll();
//	}
//	public void loadLoginPage() {
//		//driver = new ChromeDriver();
//		//driver.get("https://opensource-demo.orangehrmlive.com/");
//		setWebDriver();
//		//getWebDriver();
//	}
	public void enterCredentials(String username, String password) {
		driver.findElement(txtUsername).sendKeys(username);
		driver.findElement(txtPassword).sendKeys(password);
		
	}
	public void clickOnLoginButton() {
		driver.findElement(btnLogin).click();
	}
	public String getInvalidCredentialsMessage() {
		return driver.findElement(lblInvalidCredentials).getText();
	}
	public String getExpectedURL() {
		return expectedURL;
	}
	public String getcurrentURL() {
		return driver.getCurrentUrl();
	}
	public void logout() {
		driver.findElement(lblWelcome).click();
		WebElement elementlnkLogoute; //Explicit wait
		elementlnkLogoute= wait.until(ExpectedConditions.visibilityOfElementLocated(lnkLogout));
		elementlnkLogoute.click();
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
