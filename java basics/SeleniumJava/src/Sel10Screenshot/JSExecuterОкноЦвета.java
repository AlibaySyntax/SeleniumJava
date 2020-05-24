package Sel10Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.ConfigsReader;

public class JSExecuterОкноЦвета extends BaseClass {

public static void main(String[] args) throws IOException, InterruptedException{//, IOException {	
setUp();
//Login to HPMS Application
driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
WebElement pass=driver.findElement(By.id("txtPassword"));
pass.sendKeys(ConfigsReader.getProperty("password"));

WebElement loginBtn=driver.findElement(By.className("button"));
JavascriptExecutor js=(JavascriptExecutor)driver;
//change the background color of an element.
js.executeScript("argument[0].style.backgoundColor='red'", pass);
//click on on login btn using is
js.executeScript("argument[0].click()",loginBtn);

Thread.sleep(3000);
js.executeScript("window.scrollBy(0,250)");
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,250)");

Thread.sleep(5000);

tearDown();
}
}