package com.maven.testng;

import org.testng.annotations.Test;

public class TempClass {

	@Test(dataProvider="extractedJobCategories", dataProviderClass=DataDriver.class)
	public void test(String a) {
		
		
	}

}
