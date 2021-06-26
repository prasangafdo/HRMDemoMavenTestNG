/**
 * 
 */
package com.maven.testng;

import java.io.File;
import java.io.IOException;

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
	
	String fileLocation= "C:/Users/Prasanga Fernando/Documents/Eclipse/HRMDemoMavenTestNG/Book1.xls";
	File file = new File (fileLocation);
			
	@DataProvider(name = "extractedUser")
	public String[][] ExtractedUser() throws BiffException, IOException {
		
		Workbook wb = Workbook.getWorkbook(file);
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
	
	@Test(dataProvider = "extractedUser")
	public void ASest1(String name) {
		Reporter.log(name);
		//Reporter.log(data2);
	}
	
//	@Test (dataProvider = "extractedUser")
//	public void loginTest(String aaa) {
//		
//		Reporter.log(aaa);
//		Reporter.log(password);
//	}

}
