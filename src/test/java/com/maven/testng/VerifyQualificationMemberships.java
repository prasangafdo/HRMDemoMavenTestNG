package com.maven.testng;

import org.testng.annotations.Test;

public class VerifyQualificationMemberships extends BackgroundWorker{

	@Test
	public void VerifyAddMemberships() {
		selectMemberships();
	}
}
