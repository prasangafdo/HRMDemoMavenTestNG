package com.maven.testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@SuppressWarnings("unused")
public class VerifyUserManagementPage{

	
	@Test(dataProvider="userData", dataProviderClass = DataDriver.class)
	public void test(String userRole, String employeeName, String username, String status, String password) {
//		Reporter.log(userData);
//		System.out.println(userData);
	}

}
