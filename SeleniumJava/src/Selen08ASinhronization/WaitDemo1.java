package Selen08ASinhronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selUtils.BaseClass;

public class WaitDemo1  {

public static void main(String[] args) {
System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");	
System.setProperty("WebDriver.chrome.driver","drivers/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("http://the-internet.herokuapp.com/");

//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

driver.findElement(By.linkText("Dynamic Controls")).click();
driver.findElement(By.cssSelector("div#checkbox")).click();
driver.findElement(By.xpath("//button[@onclick='swapCheckbox")).click();

WebDriverWait wait=new WebDriverWait(driver,10);
WebElement goneText=wait.utils(ExpectedConditions.presenceOfElementLocated(By.id("massage")));
String text=goneText.getText();
System.out.println(text);

driver.findElement(By.xpath("//button@onclick='swapCheck()']")).click();
WebElement itsBack=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("message"));//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("massage"));
System.out.println(itsBack.getText());

driver.close();
}
}
