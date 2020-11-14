package Rew2SwitchToCommandsWaitsAndWebTable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.*;


public class HandlingAlert {

public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("http://www.seleniumframework.com/Practiceform/");
WebElement alertButton=driver.findElement(By.id("alert"));
alertButton.click();
Thread.sleep(2000);
Alert alert=driver.switchTo().alert();
alert.accept();

WebElement timingAlertButton=driver.findElement(By.xpath("//*[@id='timingAlert']"));
timingAlertButton.click();
WebDriverWait wait = new WebDriverWait(driver,20);
wait.until(ExpectedConditions.alertIsPresent());  
Thread.sleep(2000);
alert.accept();


}
}
