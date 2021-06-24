package com.maven.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPayGrades extends BackgroundWorker{
	
	@Test
	public void verifyAddPayGrades() {
		// TODO Auto-generated method stub
		navigateToUserManagement();
		selectPayGrades();
		Assert.assertEquals("test", "test"); //dummy assert to verify the test
	}

}
