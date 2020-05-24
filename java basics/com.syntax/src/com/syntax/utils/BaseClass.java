package com.syntax.utils;

import org.openqa.selenium.WebDriver;

import com.sun.org.apache.xml.internal.security.utils.Constants;

//import com.sun.org.apache.xml.internal.utils.Constants;

//import com.sun.org.apache.xml.internal.security.utils.Constants;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver setUp() {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		String browser=ConfigsReader.getProperty("browser").toLowerCase();
		switch(browser) {
		case "chrome":
			System.setProperty(ConfigsReader.getProperty("chrome"),Constants.CHROME_DRIVER_PATH);
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty(ConfigsReader.getProperty("fireFox"),Constants.FIREFOX_DRIVER_PATH);
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
}
