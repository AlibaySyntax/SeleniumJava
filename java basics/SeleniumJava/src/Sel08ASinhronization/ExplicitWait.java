package Sel08ASinhronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

public static void main(String[] args) {
		
	
System.setProperty("WebDriver.chrome.driver","drivers/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("http://166.62.36.207/syntaxpractice/dynamic-element-data-loadingdemo.html");
driver.findElement(By.className("btn  btn-default")).click();

driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
driver.findElement(By.linkText("startButton")).click();


boolean text=driver.findElement(By.xpath("//p[contains(text(),'Welcome syntax technologies')]")).isDisplayed();
//WebDriverWait wait =new WebDriverWait(driver,10);
//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[contains(text(),'First Name:')")));
//WebElement ele=driver.findElement(By.xpath("//p[contains(text()'Firstn Name:')]"));
System.out.println(text);
driver.quit();
}
}
