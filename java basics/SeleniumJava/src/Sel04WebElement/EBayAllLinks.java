package Sel04WebElement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayAllLinks {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com");	
	
List <WebElement> allLinks=driver.findElements(By.tagName("a"));//find element using TagName(a)it always return list Element
System.out.println("Size of all Links on Ebay:: "+ allLinks.size());//print list of WebElement

int count=0;
//Looping through the list of all links
for(WebElement link:allLinks) {
String text=link.getText();//getText() will return the inner text of web-element or visible txet on UI
if(!text.isEmpty()) {
System.out.println(text);
count++;
}
}
System.out.println("Total number of link with text is:: "+count);
//driver.quit();
}
}
