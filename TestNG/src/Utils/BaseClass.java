package Utils;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//import jdk.javadoc.doclet.Reporter;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;
//import testNG2Assert.PageInitializer;
import testNG3FrameworkEnh.PageInitializer;

public class BaseClass  {

    
	public static  WebDriver driver;
	@BeforeMethod (alwaysRun=true) // to make this method run before every @Test
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
	//driver.manage().window().fullscreen();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
	driver.get(ConfigsReader.getProperty("url"));
	
	//init all page objects as part of setup
	PageInitializer.initialize();
	return driver;
	}
	@AfterMethod(alwaysRun=true)//to make this method to run after every @Test method
	public static void tearDown() {
	if(driver!=null) {
	driver.quit();
	}}}