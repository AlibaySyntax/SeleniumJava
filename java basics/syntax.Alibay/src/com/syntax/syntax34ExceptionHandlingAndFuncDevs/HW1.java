package com.syntax.syntax34ExceptionHandlingAndFuncDevs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 {// extends BaseClass {
//Using Function
//@param args
public static void main(String[] args) {
		
setUp();

 
WebElement firstName=driver.findelement(By.id("u_0_m"))	;
sendText(firstName,ConfisReader.getProperty("name"));

WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
sendText(lastName,ConfisReader.getProperty("lastname"));

WebElement phone=driver.findElement(By.xpath("//input[@name='reg_email_']"));
sendText(phone,ConfisReader.getProperty("phone"));

WebElement pass=driver.findElement(By.name("reg_passwd_"));
sendText(pass,ConfigsReader.getProperty("password"));

WebElement month=driver.findElement(By.id("month"));

SelectDdValue(month,"mar");

WebElement day=driver.findElement(By.id("day"));


WebElement year=driver.findElement(By.id("year"));
SelectDdValue(year,"1988");

List<WebElement>gender=driver.findElements(By.cssSelector("imput[name='sex'"));

clickRadioOrChechbox(gender,2);
}

//private static void SelectDdValue(WebElement year, String string) {
	
	
}
