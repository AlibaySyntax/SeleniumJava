package Selen08ASinhronization;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLOOP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/authomation-practice-switch-windows-2/");	
//switch-windows-2/
		String singUpTitle=driver.getTitle();
		System.out.println("Main Page Title is "+singUpTitle);
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("What is the Parent Window Handle? "+parentWindowHandle);
		
		for (int i = 1; i <=3; i++) {
			driver.findElement(By.id("button1")).click();
			Thread.sleep(2000);	
		}
		Set<String>allWindowHandles=driver.getWindowHandles();
		for (String handle : allWindowHandles) {
		System.out.println("Id Of the Window:: "+handle);
		driver.switchTo().window(handle);
		driver.get("https://www.google.com");
		Thread.sleep(2000);	
		driver.close();
		
	}}}


