package com.syntax.syntax32ExelReadings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LiginToHrms {
//static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException  {
		
String filePath=System.getProperty("user.dir")+"/configs/configuration.properties";
FileInputStream fis=new FileInputStream(filePath);

Properties prop=new Properties();
prop.load(fis);
String browser=prop.getProperty("browser");

 ChromeDriver driver=null;
 FirefoxDriver driver1=null;

switch(browser.toLowerCase()) {

case"chrome":
System.getProperty("webdriver.chrome.driver","drivers/chromedriver");
driver=new ChromeDriver();
break;
case"firefox":
System.getProperty("webdriver.gecko.driver","drivers/geckodriver");
driver1=new FirefoxDriver();
break;
}
driver.get(prop.getProperty("url"));
Thread.sleep(3000);
driver.close();
}}