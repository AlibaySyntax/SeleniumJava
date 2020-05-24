package Sel05DropDown;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Iterables;
import com.syntax.utils.BaseClass;

public class DropDownDemo3 extends BaseClass {

public static void main(String[] args) throws IOException, Exception {
	
ArrayList<String>expectedList=new ArrayList<>();
expectedList.add("Asia");
expectedList.add("Europe");
expectedList.add("Africa");
expectedList.add("Australia");
		
setUp();
WebElement continents=driver.findElement(By.id("continents"));
Select select=new Select(continents);
select.selectByValue("AUS");
List<WebElement>optionList=select.getOptions();
Iterator<WebElement>it=optionList.iterator();

while(it.hasNext()) {
String text=it.next().getText();
System.out.println(text);
}
if(expectedList.containsAll(expectedList)) {
	System.out.println("The list matches");
}else {
	System.out.println("List Did NOT match");
}
}
}