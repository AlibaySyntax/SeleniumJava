package Selen04WebElementComands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttrebuteMethod {

public static void main(String[] args) {
	
	String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

	WebDriver driver=new ChromeDriver();

	driver.get(url);

	//driver.get("http://syntaxtechs.com/"); //syntaxtechs.com/
	//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	
WebElement userName=driver.findElement(By.name("txtUsername"));
userName.sendKeys("Admin");
String text=userName.getAttribute("value");// It will return any attribute your specify
System.out.println(text);
	
	
	
	
	
//	driver.findElement(By.id("txtPassword")).sendKeys("Admin123");
//
//	driver.findElement(By.className("button")).click();

}
}
