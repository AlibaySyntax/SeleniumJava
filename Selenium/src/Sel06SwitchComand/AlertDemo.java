package Sel06SwitchComand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

//import sun.jvm.hotspot.debugger.cdbg.BaseClass;

public class AlertDemo {

public static void main(String[] args) throws InterruptedException  {
		
WebDriver driver=BaseClass.setUp();//Below code is for UItestPractice.com

driver.findElement(By.xpath("//button[@id='alert']")).click();
//Handling confirmation Alert
Alert simpleAlert=driver.switchTo().alert();
String simpleAText=simpleAlert.getText();
System.out.println("This is simple alert text:: " +simpleAText);

simpleAlert.accept();

driver.findElement(By.id("confirm")).click();

Alert confirmAlert = driver.switchTo().alert();
Thread.sleep(1000);
String confirmAText=confirmAlert.getText();
System.out.println("This is Confirm alert text:: "+confirmAText);
Thread.sleep(1000);
confirmAlert.dismiss();
Thread.sleep(1000);

//Handling Prompt alert/confirm alerts by providing some confirm 
//Message
String name="Alex Smith";
driver.findElement(By.id("prompt")).click() ;
Alert promptAlert=driver.switchTo().alert();
System.out.println("This is Prompt alert text:: "+promptAlert.getText());

promptAlert.sendKeys(name);
promptAlert.accept();

String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
System.out.println("Text added to alert box:: "+text);

//String name="Alex Smith";

if(text.contains(name)) {  //("Alex Smith")
System.out.println("Text "+name+" was succefuly added"); 
}else {
System.out.println("Text "+name+" was not entered");
}
BaseClass.tearDown();
}
}
