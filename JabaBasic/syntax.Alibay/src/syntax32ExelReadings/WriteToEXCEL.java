package syntax32ExelReadings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToEXCEL {

public static void main(String[] args) throws IOException, FileNotFoundException {

String filePath=System.getProperty("user.dir")+"/Users/apple/java basics/testdata/Test.xlsx";
FileInputStream fis=new FileInputStream(filePath);
Workbook book=new XSSFWorkbook(fis);

//Writing  into existing sheet
Sheet sheet1=book.getSheet("Sheet1");
sheet1.getRow(0).createCell(5).setCellValue("Country");

sheet1.createRow(3).createCell(0).setCellValue("HIchen");
Sheet customSheet=book.createSheet("TestSheet");

FileOutputStream fos=new FileOutputStream(filePath);
book.write(fos);



}

}
