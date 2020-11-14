package Selen07Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selUtils.BaseClass;

public class TC2 extends BaseClass {

public static void main(String[] args) {
		
setUp();

driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
WebElement df=driver.findElement(By.xpath("//a[@href='basic-select-dropdown-demo.html']"));
df.click();

WebElement a=driver.findElement(By.id("select-demo"));
a.click();
Select select=new Select(a);
select.selectByValue("Tuesday");

List<WebElement> list=select.getOptions();
for (WebElement l:list) {
	String text=l.getText();
	System.out.println(text);
	if(text.contentEquals("Monday")) {
	if(l.isSelected()) {
	System.out.println("IT IS SELECTED");
	}else {
	System.out.println("IT is NOT");	
	}}}
WebElement web=driver.findElement(By.xpath("//select[@name='states']"));
web.click();
Select se=new Select(web);
se.selectByIndex(0);
se.selectByIndex(1);
se.selectByIndex(2);
se.selectByIndex(3);
se.deselectByIndex(0);
}}
