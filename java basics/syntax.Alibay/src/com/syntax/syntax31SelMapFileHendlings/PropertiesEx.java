package com.syntax.syntax31SelMapFileHendlings;
import java.io.FileInputStream;
import java.io.IOException;  
	import org.apache.poi.ss.usermodel.Cell;  
	import org.apache.poi.ss.usermodel.Row;  
	import org.apache.poi.ss.usermodel.Sheet;  
	import org.apache.poi.ss.usermodel.Workbook;  
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
	public class PropertiesEx {
	
public static void main (String [] args) throws IOException {

	String filePath = "C: \\ Users \\ deger \\ OneDrive \\ Documents";  
	FileInputStream fis = new FileInputStream (filePath);  
	// accessing workbook 
	Workbook wbook = new XSSFWorkbook (fis);  
	//Workbook wbook;
	Sheet sheet = wbook.getSheet ("Sheet1");  
	// accessing row 
	Row row1 = sheet.getRow (0);  
	Cell cell= row1.getCell (1);  
	// get value from cell 
	String r1cell2 = cell.toString ();  
	System.out.println (r1cell2);
	}
	}
