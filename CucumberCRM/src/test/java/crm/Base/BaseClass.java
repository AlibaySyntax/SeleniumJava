package crm.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import crmUtils.ConfigsReader;
import crmUtils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
//import testBase.PageInitializer;


public class BaseClass  {

    
	public static  WebDriver driver;
	
	public static  WebDriver setUp() { 
	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");		
    ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
//	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
	
	switch(ConfigsReader.getProperty("browser").toLowerCase()) {
	
	case"chrome":
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
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
	PageInitializer.initialize();// PropertyInitializer.initialize();
	return driver;
	}
	public static void tearDown() {
	if(driver!=null) {
	driver.quit();
	}}}