package Sel08ASinhronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class WaitDemo {

public static void main(String[] args) throws InterruptedException {
		
//WebDriver driver1=BaseClass.setUp();
System.setProperty("WebDriver.chrome.driver","drivers/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("http:/uitestpractice.com/Students/Contact");
driver.manage().window().fullscreen();

//this is kinda global wait an it will wait for each and every element.
//it waits on for element to be found , meaning it will work for findelement
//and findElement methods only.As soon as its found,the remaning time will be ignored.

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.linkText("This is a Ajax link")).click();

String text=driver.findElement(By.className("ContactUs")).getText();
System.out.println(text);







	}

}
