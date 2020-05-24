package com.test01;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Utils.ConfigsReader;

//import TestNGSecond.CommonMethods;


public class TitleLogoAndLoginValidation extends com.Utils.CommonMethods {
@BeforeMethod
public void openAndNavigate() {
setUp();	
}
@AfterMethod
public void QuitBrowser() {
tearDown();
}
@Test
public void TitleVlogovalidation() {
String expectedTitle="Human Management System-babla balla";
String actualTitle=driver.getTitle();
if(expectedTitle.equals(actualTitle));
System.out.println("titleValidation passed");
}else{
System.out.println("titleValidation failed");
}
@Test
public void logovalidation() {
String logoPath="//div[@id=divLogo]/img";
WebElement logo=driver.findElement(By.xpath(logoPath));
boolean isDisplayed=logo.isDisplayed();
if(isDisplayed) {
System.out.println("logoValidation passed");
}else {
System.out.println("logoValidation failed");
throw new Exception();
}
}
@Test
public void Validation() {
WebElement username=driver.findElement(By.id("txtUsername"));
sendText(username,"Admin");
sendText(username,ConfigsReader.getProperty(By.id("username")));
WebElement password=driver.findElement(By.id("txtPassword"));
sendText(username,ConfigsReader.getProperty(By.id("password")));

click(driver.findElement(By.id("buttnlogin")));
}
}