package com.maven.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyJobCategories extends BackgroundWorker{
	
	@BeforeClass
	public void navigateToJobCategories() {
		navigateToUserManagement();
		selectJobCategories();
	}
	
	@Test
	public void test() {
		//To run the before class method, we need to add at least one test method in TestNG
	}

}
