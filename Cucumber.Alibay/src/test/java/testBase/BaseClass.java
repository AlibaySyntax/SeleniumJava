package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cuUtils.ConfigsReader;
import cuUtils.Constants;
//import hrms.Utils.ConfigsReader;
//import hrms.Utils.Constants;
//import testNG2Assert.PageInitializer;
//import PageInitializer;
import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.PageInitializer;

public class BaseClass  {

    
	public static  WebDriver driver;
	
	public static  WebDriver setUp() { 
	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");		
    ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
//	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
    String headless=ConfigsReader.getProperty("headless");
	switch(ConfigsReader.getProperty("browser").toLowerCase()) {
	
	
	case"chrome":
		WebDriverManager.chromedriver().setup();
		ChromeOptions cOption=new ChromeOptions();
		if(headless.equalsIgnoreCase("true")) {
		cOption.setHeadless(true);
		driver=new ChromeDriver(cOption);
		}else {
		driver=new ChromeDriver(cOption);	
		}
	    break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	default:
	throw new RuntimeException("Browser is not supported");
	}
	//driver.manage().window().fullscreen();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
	//driver.get(ConfigsReader.getProperty("url"));
	//init all page objects as part of setup
	PageInitializer.initialize();
	return driver;
	}
	public static void tearDown() {
	if(driver!=null) {
	driver.quit();
	}}}