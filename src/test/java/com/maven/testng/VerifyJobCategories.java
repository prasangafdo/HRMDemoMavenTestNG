package com.maven.testng;

import org.testng.annotations.BeforeTest;

public class VerifyJobCategories extends BackgroundWorker{
	
	@BeforeTest
	public void navigateToJobCategories() {
		navigateToUserManagement();
		selectJobCategories();
	}

}
