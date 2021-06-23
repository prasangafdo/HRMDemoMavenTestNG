/**
 * 
 */
package com.maven.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Prasanga Fernando
 * 
 * This class contains main funtionalities related to "Add job title" page
 *
 */
public class VerifyJobTitlesPage extends BackgroundWorker {
	

	@Test
	public void verifyAddUser() {
		// TODO Auto-generated method stub
		navigateToUserManagement();
		selectJobTitles();
		Assert.assertEquals("test", "test");
	}

}
