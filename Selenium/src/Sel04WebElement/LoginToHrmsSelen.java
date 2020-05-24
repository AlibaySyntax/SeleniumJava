package Sel04WebElement;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginToHrmsSelen {
//public static WebDriver driver;
/**
 * Use this method in need of lunching chrome or firefox browser. 
 * @param args
 * @throws IOException 
 * @throw InterruptedException
 */

public static void main(String[] args) throws IOException, InterruptedException {
		
String filePath=System.getProperty("user.dir")+"/configs/configuration.properties";
FileInputStream fis=new FileInputStream(filePath);

Properties prop=new Properties();
prop.load(fis);
String browser=prop.getProperty("browser");

WebDriver driver=null;

switch(browser.toLowerCase()) {

case"chrome":
	System.getProperty("webdriver.chrome.driver","drivers/chromedriver");
	driver=new ChromeDriver();
	break;
case"firefox":
System.getProperty("webdriver.gecko.driver","drivers/geckodriver");
driver=new FirefoxDriver();
break;
}
driver.get(prop.getProperty("url"));
Thread.sleep(3000);
driver.close();
}
}
