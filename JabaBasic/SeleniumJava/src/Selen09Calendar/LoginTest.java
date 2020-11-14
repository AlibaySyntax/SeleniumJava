package Selen09Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selUtils.CommonMethods;
import selUtils.ConfigsReader;



public class LoginTest extends CommonMethods  {

public static void main(String[] args) {
/*
 * User should be able to login to the application with valid credentials		
 */
//Open browser and navigate to url

setUp();

//sending username
WebElement username=driver.findElement(By.id("txtUsername"));
sendText(username,ConfigsReader.getProperty("username"));

//sending password
WebElement password=driver.findElement(By.id("txtPassword"));
sendText(password,ConfigsReader.getProperty("password"));
//click on Login
//close broser
tearDown();
}
}
