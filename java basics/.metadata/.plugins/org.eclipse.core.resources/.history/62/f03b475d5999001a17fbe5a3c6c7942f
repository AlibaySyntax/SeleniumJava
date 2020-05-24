package Sel10Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassAmazonDemo {

public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=BaseClass.setUp();
WebElement account=driver.findElement(By.xpath("/a[@id='nav-link-account']"));
Actions action=new Actions(driver);
action.moveToElement(account).perform();
//Hover the mouse
WebElement element=driver.findElements(By.xpath("//div[@id='nav-flyout-ya-newCust']"))).getText();
if(element.contains("Start")) {
System.out.println("Menu displayed");
}else {
System.out.println("Menudid NOT display");	
}
//How to rightclick on a element
action.contextClick(element).perform();
WebElement searchBox=driver.findElement(By.xpath("//input[@id='twootabsearchtextbox']"));
//how to double click on a element
action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
//action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("Movie").perform();

Thread.sleep(5000);
BaseClass.tearDown();

}
}
