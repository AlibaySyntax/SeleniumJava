package com.testautomation.StepDef;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomation.Utility.PropertiesFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YouTubeSearchStepDef {
public static WebDriver driver;
PropertiesFileReader obj =new PropertiesFileReader();

@Given("Open chrome browser and enter url")
public void open_chrome_browser_and_enterurl() throws Throwable {
Properties properties=obj.getProperty();

System.setProperty("webdriver.chrome.driver","/Users/apple/eclipse-workspace/SeleniumCucumberBDDFramework/Driver/chromedriver");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(properties.getProperty("browser.baseurl"));
Thread.sleep(3000);
}
@When("Enter search creteria")
public void enter_search_creteria() throws Throwable {
driver.findElement(By.id("search")).sendKeys("selenium c# by bakkappa n");
Thread.sleep(1000);
}
@Then ("Click  on search button")
public void click_on_search_button() throws Throwable {
driver.findElement(By.cssSelector("#search-icon-legacy")).click();
Thread.sleep(3000);
driver.quit();	
	
	
	
}
}