package Rew4FilePropertiesHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelFileDemo {
	
public static void main(String[] args) throws IOException {
String projectPath=System.getProperty("user.dir");
System.out.println(projectPath);

String filePath=projectPath+ "/extra/exel.xlsx";
System.out.println(filePath);

FileInputStream fileIS=new FileInputStream(filePath);
//get the whole file
Workbook book=new XSSFWorkbook(fileIS);
//get the sheet from the file
Sheet sheet= book.getSheet("Sheet1");
//get the number of rows,the one that has data
int rows = sheet.getPhysicalNumberOfRows();
//get one row from the current sheet
Row row0=sheet.getRow(0);
//get the number of cells in the current row
int cells=row0.getLastCellNum();
//Let's iterate the cells of the header/row
for(int i=0; i<cells; i++) {
String data=row0.getCell(i).toString();
System.out.println(data+" ");
System.out.println();
}
for(int row=1;row<rows;row++) {
//for every row i will iterate the cells
///let's get the current row
Row curRow=sheet.getRow(row);
//How many cells ther are in the current row
int curCells=curRow.getLastCellNum();
for(int cell=0; cell<curCells; cell++) {
	Cell Celldata=curRow.getCell(cell);
	String cellStringData=Celldata.toString();
	System.out.println(Celldata+" ");
	System.out.println(curRow.getCell(cell).toString()+ " ");	

System.out.println();
}
Map<String,String>maryMap=new LinkedHashMap<>();
//Let's create a map for Mary row 2
for(int i=0; i<cells; i++) {
sheet.getRow(0).getCell(i);
String headerCell=sheet.getRow(0).getCell(i).toString();
String maryCell=sheet.getRow(2).getCell(i).toString();
maryMap.put(headerCell,maryCell);
System.out.println(maryMap);
}

//I will have three Maps & List
//Iterating data rows, not header
Map<String,String>mapList=new LinkedHashMap<String,String>();
for(int i=0; i<cells; i++) {

Map<String,String>map=new LinkedHashMap<>();
mapList.putAll(map);
for(int j=0; j<cells; j++) {
map.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i).getCell(j).toString());
//mapList.add(map);
}
System.out.println(mapList);

}}}}
//HW for




