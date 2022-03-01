package com.maven.testng.function;

import com.maven.testng.page.CommonPage;

public class Common {
	static CommonPage common = new CommonPage();
	
	public static void setResolutionTo1080p() {
		common.setResolutionTo1080p();
	}

}
