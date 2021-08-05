package com.maven.testng;

import org.testng.annotations.Test;

public class VerifyQualificationLanguages extends BackgroundWorker{

	@Test
	public void navigate() {
		selectLanguages();
	}
}
