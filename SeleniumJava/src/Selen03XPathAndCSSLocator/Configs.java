package Selen03XPathAndCSSLocator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Configs {
	public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        FileInputStream fis=new FileInputStream("/Users/apple/eclipse-workspace/java basics/SeleniumJava/Configs");
        
        Properties prop=new Properties();
        prop.load(fis);
        String browser=prop.getProperty("browser"),
                url=prop.getProperty("url"),
                username=prop.getProperty("username"),
                password=prop.getProperty("password");
        WebDriver browser1 = null;
        switch(browser) {
        case "chrome":
            browser1=new ChromeDriver();
            break;
        case "safari":
            browser1=new SafariDriver();
            break;
        }
        browser1.get(url);
        browser1.findElement(By.id("email")).sendKeys(username);
        browser1.findElement(By.id("pass")).sendKeys(password);
        browser1.findElement(By.id("u_0_b")).click();
}
}
