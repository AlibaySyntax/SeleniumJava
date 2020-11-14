package Selen03XPathAndCSSLocator;
	import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	public class TestData {
	
		public static void main(String[] args) throws Exception {
			String diractory = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", diractory + "\\drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			String filepath = diractory + "\\properties\\Testdata.properties";
			FileInputStream file = new FileInputStream(filepath);
			Properties prop = new Properties();
			prop.load(file);
			String urlm = prop.getProperty("url");
			String usern = prop.getProperty("username");
			String pass = prop.getProperty("password");
			driver.get(urlm);
			driver.findElement(By.name("txtUsername")).sendKeys(usern);
			driver.findElement(By.name("txtPassword")).sendKeys(pass);
			driver.findElement(By.name("Submit")).click();
		}
	}
	



