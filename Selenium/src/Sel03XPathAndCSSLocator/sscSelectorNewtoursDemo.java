package Sel03XPathAndCSSLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sscSelectorNewtoursDemo {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
	WebDriver driver=new ChromeDriver();

	driver.get("http://newtours.demoaut.com/");
	
	driver.findElement(By.linkText("Register here")).click();
	
	driver.findElement(By.name("firstName")).sendKeys("Alibay");
	
	driver.findElement(By.name("lastName")).sendKeys("Aitov");
	
	driver.findElement(By.name("Phone")).sendKeys("1234567890");
	
	driver.findElement(By.id("userName")).sendKeys("Ali74");
	
	driver.findElement(By.id("pass")).sendKeys("12345678");
	
	driver.findElement(By.id("email")).sendKeys("aitov.74@mail.ru");
	
	driver.findElement(By.name("address1")).sendKeys("1 Fletcher Rd. 9");
	
	driver.findElement(By.name("address1")).sendKeys("Monsey");
	
	driver.findElement(By.name("state/province")).sendKeys("NY");
	
	driver.findElement(By.name("postalCode")).sendKeys("10952");
	
}
}


