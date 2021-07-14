package com.maven.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyWorkShifts extends BackgroundWorker{
	
	@BeforeClass
	public void navigateToWorkShifts() {
		navigateToUserManagement();
		selectWorkShifts();
	}
	
	@Test
	public void test1() {
		
	}

}
