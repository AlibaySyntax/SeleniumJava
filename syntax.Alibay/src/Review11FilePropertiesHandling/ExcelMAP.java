package Review11FilePropertiesHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMAP {

public static void main(String[] args) throws IOException {



		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath=projectPath + "/Configs/Test.xlsx"; //"/extra/Example.properties";
		System.out.println(filePath);

		System.out.println();

		FileInputStream fileIS=new FileInputStream (filePath);

		// Get the whole file
		Workbook book= new XSSFWorkbook(fileIS);

		// Get the sheet from the file
		Sheet sheet=book.getSheet("Sheet1");

		// Get the number of rows, the last one that has data
		int rows = sheet.getPhysicalNumberOfRows();

		// Get one row from the sheet
		Row row0=sheet.getRow(0);

		// Get the number of cells in the current row
		int cells=row0.getLastCellNum();
		

// Let's suppose that we know that there same number of cells in every row

Map<String,String>maryMap=new LinkedHashMap<>()	;
// Let's create a MAP for Mary, which is row 2
for (int i=0; i<cells; i++) {
String headerCell=sheet.getRow(0).getCell(i).toString();
String maryCell=sheet.getRow(2).getCell(i).toString();
maryMap.put(headerCell, maryCell);
}
System.out.println(maryMap);
//==============================================
// I will have three maps
// I will store the three maps into a list
List<Map<String,String>>mapList=new ArrayList<>();
//==============================================
// Iterating data rows, not header
for(int i=1; i<rows; i++ ) {	
// For every data row I will create a MAP
Map<String,String>map=new LinkedHashMap<>();
// Iterating cells, to fill the MAP
for(int j=0; j<cells; j++) {
map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i).getCell(j).toString());
}
// After I  filled the MAP, I am adding it adding it into the list
mapList.add(map);
}
System.out.println(mapList);		
		
	


}}
