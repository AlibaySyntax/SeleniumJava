package Selen05DropDown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Selen07Amazon.TestClass;
import selUtils.BaseClass;
public class MultiSelecteDD {

public static void main(String[] args) throws InterruptedException, IOException {
		
WebDriver driver=BaseClass.setUp();
WebElement multiSelectDD=driver.findElement(By.id("continentsMultiple"));
Select select=new Select(multiSelectDD);

boolean isMultiple=select.isMultiple();
System.out.println("This DropDown is Multi Select?: "+isMultiple);

if(isMultiple) {
select.selectByIndex(1);
select.selectByVisibleText("Africa");
Thread.sleep(2000);


//select.deselectByIndex(1);
select.deselectAll();
}
//TestClass.select("Sunday"); for example
}
}
