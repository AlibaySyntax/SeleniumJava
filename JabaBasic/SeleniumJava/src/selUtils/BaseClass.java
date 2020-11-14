package selUtils;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import jdk.javadoc.doclet.Reporter;
import java.util.function.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.*;

public class BaseClass {


	public static  WebDriver driver;
	public static  WebDriver setUp() { 
			
	ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
	switch(ConfigsReader.getProperty("browser").toLowerCase()) {
	
	case"chrome":
	System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
	driver=new ChromeDriver();
	break;
	
	case "firefox":
		System.setProperty("webdriver.gecko.driver",Constants.GECKO_DRIVER_PATH);
		driver=new FirefoxDriver();
		break;
	default:
	throw new RuntimeException("Browser is not supported");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
	driver.get(ConfigsReader.getProperty("url"));
	
	return driver;
	}
	public static void tearDown() {
	if(driver!=null) {
	driver.quit();
	}}}