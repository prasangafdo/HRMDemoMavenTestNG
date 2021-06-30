/**
 * 
 */
package com.maven.testng;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author Prasanga Fernando
 * This class contains the Data provider methods that I'm using to extract data from the excel sheet.
 *
 */
public class DataDriver {
	
	
	static Workbook wb;
	
	public static void getWorkbook() throws BiffException, IOException{
		String fileLocation= "C:/Users/Prasanga Fernando/Documents/Eclipse/HRMDemoMavenTestNG/Book1.xls";
		File file = new File (fileLocation);
		wb = Workbook.getWorkbook(file);
		
	}
	
		
	@DataProvider(name = "testdata")
	public String[][] ExtractedUser() throws BiffException, IOException {
		
		Sheet sheet = wb.getSheet(0);
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		
		String[][] data = new String[rowsCount][columnsCount];
		
		for(int i=0;i<rowsCount;i++) {
			for(int j=0;j<columnsCount;j++) {
				Cell cell = sheet.getCell(j,i);
				data[i][j] = cell.getContents();
				
			}
		}
		return data;
	}
	
//	@Test(dataProvider = "testdata")
//	public void ASest1(String name) {
//		Reporter.log(name);
//		//Reporter.log(data2);
//	}
	
	
	@DataProvider(name = "payGrades")
	public String[][] extractedJobTitles() throws BiffException, IOException{
		getWorkbook();
		Sheet sheet = wb.getSheet(1);
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		
		String[][] extractedPayGrades = new String [rowsCount][columnsCount];
		
		for(int i=0;i<rowsCount;i++) {
			for(int j=0;j<columnsCount;j++) {
				Cell cell = sheet.getCell(j,i);
				extractedPayGrades[i][j] =cell.getContents();
			}
		}
		return extractedPayGrades;
		
	}
	
//	@Test(dataProvider ="testdata1")
//	public void zzz(String data1) {
//		Assert.assertEquals("a", "a");
//	}
	
	@DataProvider(name ="userData1")
	public Object[][] addUser() throws BiffException, IOException {
		getWorkbook();
		Sheet sheet = wb.getSheet(2);
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		
		String[][] userData = new String[rowsCount][columnsCount];
		
		for(int i=0;i<rowsCount;i++) {
			for(int j=0;j<columnsCount;j++) {
				Cell cell = sheet.getCell(j,i);
				userData[i][j] = cell.getContents();
			}
		}
		
		return userData;
		
	}
	
	@Test(dataProvider="userData1")
	public void test(String userData) {
		Reporter.log(userData);
		System.out.println(userData);
	}

}
