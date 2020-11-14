package Selen06SwitchComand;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selUtils.BaseClass;

public class FrameDemo extends BaseClass {

public static void main(String[] args, WebDriver driver) throws InterruptedException, IOException {
	
setUp();//please 

String text=driver.findElement(By.xpath("//h3[text()='click on the below link:']")).getText();
System.out.println(text);
/*We 
 * 
 */
driver.switchTo().frame(0);
WebElement name=driver.findElement(By.id("name")); 
name.sendKeys("Vital");
driver.switchTo().defaultContent();
Thread.sleep(2000);

//By NameOrID
driver.switchTo().frame("iframe_a");//switch method is used to switch to a frame
driver.switchTo().frame("iframe_a");//switch method is  to switch to a frame
//driver.findElement(By.id("name")).sendKeys("Vital");
name.clear();
name.sendKeys("Alibay");
driver.switchTo().defaultContent();
Thread.sleep(2000);

//By WebElement
WebElement firstName=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
driver.switchTo().frame(firstName);
name.clear();
name.sendKeys("Asel");


Thread.sleep(2000);
tearDown();

}	
}	


