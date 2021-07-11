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
	
	
	@DataProvider(name ="userData")
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
	
	@DataProvider(name="jobTitle")
	public String[][] extractedJobTitle() throws BiffException, IOException{
		getWorkbook();
		Sheet sheet = wb.getSheet(3);
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		
		String[][] extractedData = new String[rowsCount][columnsCount];
		
		for(int i=0;i<rowsCount;i++) {
			for(int j=0;j<columnsCount;j++) {
				Cell cell = sheet.getCell(j,i);
				extractedData[i][j]=cell.getContents();
			}
		}
		
		return extractedData;
		
	}
	
	@DataProvider(name = "extractedEditedJobTitles")
	public Object[][] extractedEditedJobTitles() throws BiffException, IOException{
		
		getWorkbook();
		Sheet sheet = wb.getSheet(5);
		int columnsCount = sheet.getColumns();
		int rowsCount = sheet.getRows();
		
		String[][]extractedEditedJobTitles = new String[rowsCount][columnsCount];
		
		for(int i=0;i<rowsCount;i++) {
			for (int j=0;j<columnsCount;j++){
				Cell cell = sheet.getCell(j,i);
				extractedEditedJobTitles[i][j] = cell.getContents();
			}
		}
		return extractedEditedJobTitles;
	}
	
	@DataProvider(name ="extractedEmploymentStatus")
	public Object[][] extractedEmploymentStatus() throws BiffException, IOException{
		getWorkbook();
		Sheet sheet = wb.getSheet("AddEmploymentStatus");
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		
		String[][] extractedEmploymentStatus = new String[rowsCount][columnsCount];
		
		for(int i=0;i<rowsCount;i++) {
			for(int j=0;j<columnsCount;j++) {
				Cell cell = sheet.getCell(j,i);
				extractedEmploymentStatus[i][j]= cell.getContents();
			}
		}
		
		return extractedEmploymentStatus;
	}
	
}
