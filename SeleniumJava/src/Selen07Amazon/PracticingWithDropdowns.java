package Selen07Amazon;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selUtils.BaseClass;

public class PracticingWithDropdowns extends BaseClass {

public static void main(String[] args) throws Exception {
		
setUp();
List<WebElement>allDDs=driver.findElements(By.tagName("a"));
for(WebElement oneDD: allDDs) {
String dd=oneDD.getText();
System.out.println(dd);
if (dd.equals("List Box")) {
oneDD.click();
break;
}
if(dd.equals("Booststar List Box")) {
	oneDD.click();
break;
}
}
List<WebElement> listOfDD= driver.findElements(By.tagName("li"));
for(WebElement oneItem:listOfDD) {
	String item=oneItem.getText();

	if (item.equals("Morbi leo risus")) {
		oneItem.click();
	break;
	}
}
}	
}

