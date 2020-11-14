package Selen08ASinhronization;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
	WebDriver driver=new ChromeDriver();

	driver.get("http://166.62.36.207/syntaxpractice/javascript-alert-box-demo.html");	

	String singUpTitle=driver.getTitle();
	System.out.println("Main Page Title is "+singUpTitle);
	String parentWindowHandle=driver.getWindowHandle();
	System.out.println("What is the Parent Window Handle? "+parentWindowHandle);
	
	driver.findElement(By.linkText("Follow on Tnstagramm")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Like on facebook")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Follow Instagram & facebook")).click();
	
	Set<String>allWindowHandles=driver.getWindowHandles();//returns ser of window handle 
	System.out.println("What is the Number of Window opened? "+allWindowHandles);
	Iterator<String>it=allWindowHandles.iterator();
	
	while(it.hasNext()) {
		String handle=it.next();//Grad the next window handle
		if(handle.equals(parentWindowHandle)) {//switch to next window ohly if not same parent
		driver.switchTo().window(handle);
	System.out.println(driver.getTitle());
	driver.close();
	Thread.sleep(1000);
}}		
driver.quit();
}
}
