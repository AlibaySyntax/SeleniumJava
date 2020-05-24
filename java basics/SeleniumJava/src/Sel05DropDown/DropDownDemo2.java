package Sel05DropDown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;
import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass{

public static void main(String[] args) throws InterruptedException, IOException {//throws IOException {
	
//try {
setUp();
//} catch (IOException e) {	
//e.printStackTrace();
//}
WebElement continents=driver.findElement(By.id("continents"));

Select select=new Select(continents);

List<WebElement>options=select.getOptions();//It will return list of all option in the DD

for(WebElement option:options) {// Loop on above options List
	String text=option.getText();
	System.out.println(text);
if(text.equals("Africa")) {
option.click();
String ddText=option.getText();
if(ddText.equals("Africa")) {
System.out.println("Africa is selected:: "+option.isSelected());
}else {
System.err.println("Africa is Not selected");
}

}
boolean isMulltiple=select.isMultiple();//isMultiple(); shows if the
System.out.println("The Continent DD is Multiple:: "+isMulltiple);

tearDown();		
}
}
}
