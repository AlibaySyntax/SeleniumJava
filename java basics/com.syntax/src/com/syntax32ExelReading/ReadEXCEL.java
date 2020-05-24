package com.syntax32ExelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadEXCEL {

public static void main(String[] args) throws IOException {
		
	String filePath="/Users/apple/Documents/Test.xlsx";
	String filePath1=System.getProperty("user.dir")+"/testdata/Test.xlsx";
	FileInputStream fis=new FileInputStream(filePath);
	
//Get an Object of Workbook type
Workbook book =new XSSFWorkbook(fis);
Sheet sheet=book.getSheet("Sheet1");

//Need to find numbers or rows
int rows = sheet.getPhysicalNumberOfRows();

//Find number of columns
int cols=sheet.getRow(0).getLastCellNum();

//Get data from all rows all columns
for(int r=0; r<rows; r++) {// Iterates over rows
for(int c=0; c<cols; c++) {
String cellVal=sheet.getRow(r).getCell(c).toString();
System.out.println(cellVal+ " ");
}
System.out.println();	
}
	
}
}
