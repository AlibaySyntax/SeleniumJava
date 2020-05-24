package Sel03XPathAndCSSLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
WebDriver driver=new ChromeDriver();

driver.get(url);
driver.findElement(By.xpath("//xpath"));		

	}

}
