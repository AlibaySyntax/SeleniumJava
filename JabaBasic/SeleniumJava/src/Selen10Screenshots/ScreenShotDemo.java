package Selen10Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import selUtils.ConfigsReader;



public class ScreenShotDemo extends BaseClass {

public static void main(String[] args) throws IOException, InterruptedException{//, IOException {	
setUp();
//Login to HPMS Application
driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
driver.findElement(By.className("button")).click();
Thread.sleep(2000);
//Create an object of TakesScreenchot interface and cast the Webdriver with it.
TakesScreenshot ts=(TakesScreenshot)driver;
//Use getScreenshotAs() method to take the screenshot(int the constructor pass Type.File
File souceFile=ts.getScreenshotAs(OutputType.FILE);
//Copy the file from source to a another destination
//FileUtils.copyFile(souceFile, new File("screenshots/HRMS/pics.dashboard.png"));
FileUtils.copyFile(souceFile, new File("screenshots/HRMS/pics.png"));    //dashboard.png
//
tearDown();

}
}