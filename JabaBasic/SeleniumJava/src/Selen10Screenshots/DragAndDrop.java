package Selen10Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
String url="https://jqueryui.com/droppable/";

System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");
System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get(url);

driver.switchTo().frame(0);
WebElement drag=driver.findElement(By.id("draggable"));
WebElement drop=driver.findElement(By.id("droppable"));

Actions action=new Actions(driver);
//drag a fale and drop it in the Source. longer way 
//action.clickAndHold(drag).moveToElement(drop).release().perform();
//Thread.sleep(3000);
//driver.navigate().refresh();
//Thread.sleep(3000);

//CommonMethods.waitForClickability(drag);
action.dragAndDrop(drag, drop).perform();
Thread.sleep(5000);
driver.quit();










}
}
