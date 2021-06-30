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

//@SuppressWarnings("unused")
public class VerifyUserManagementPage{
	
//	@Test(dataProvider="userData", dataProviderClass = DataDriver.class)
//	public void test(String userData) {
//		Reporter.log(userData);
//	}
	
	
	@DataProvider(name ="userData1")
	public String[][] addUser() throws BiffException, IOException {
		String fileLocation= "C:/Users/Prasanga Fernando/Documents/Eclipse/HRMDemoMavenTestNG/Book1.xls";
		File file = new File (fileLocation);
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sheet = wb.getSheet(2);
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		
		String[][] userData = new String[rowsCount][columnsCount];
		
		for(int i=0;i<rowsCount;i++) {
			for(int j=0;j<columnsCount;j++) {
				Cell cell = sheet.getCell(j,i);
				userData[i][j] = cell.getContents();
				Reporter.log(cell.getContents());
				System.out.println(cell.getContents());
			}
		}
		
		return userData;
		
	}
	
	@Test(dataProvider="userData1")
	public void test(String userRole, String employeeName, String username, String status, String password) {
//		Reporter.log(userData);
//		System.out.println(userData);
	}

}
