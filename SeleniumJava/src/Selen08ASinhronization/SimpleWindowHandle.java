package Selen08ASinhronization;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
WebDriver driver=new ChromeDriver();

driver.get("https://accounts.google.com/signup");	

String singUpTitle=driver.getTitle();
System.out.println("Main Page Title is "+singUpTitle);
//driver.close();
driver.findElement(By.linkText("Help")).click();
/*How to get window handle?
*In Selenium we have two method to get the hand of window.
*getWindowHandle();
*getWindowHandles();
* Needes using ITERATOR
 */
Set<String> allWindowHandles=driver.getWindowHandles();//Returns st of string IDs of 
//all wind cuurently opened by the current instance
System.out.println("Number of window opened are:: "+allWindowHandles.size());//get size of set
Iterator<String>it=allWindowHandles.iterator();
String mainWindowHandle=it.next();//Returns the id of Main Window
System.out.println("Id is Main wondow:: "+mainWindowHandle);
String childWindowHandle=it.next();//Return the id of Child Window
System.out.println("Id of Child window:: "+childWindowHandle);

driver.switchTo().window(childWindowHandle);
String childWindowTitle=driver.getTitle();
System.out.println("Child Page Title is:: "+childWindowTitle);
driver.close();


}}
