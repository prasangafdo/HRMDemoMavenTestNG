package com.maven.testng;

import org.testng.annotations.Test;

public class TempClass {

	@Test(dataProvider="extractedWorkShifts", dataProviderClass=DataDriver.class)
	public void test(String shiftName, String hoursFrom, String hoursTo, String employee) {
		
		
	}

}
