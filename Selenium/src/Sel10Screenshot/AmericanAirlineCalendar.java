package Sel10Screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class AmericanAirlineCalendar {
//private static final CharSequence TAB = null;

/*TC 1. Calendar headers. drivers and rows verification Open browser Go to
* "https:www.aa.com/homePage. doEnter from and To Select
* 		
*/
public static void main(String[] args) throws InterruptedException {
// Open chrome browser go to "https:www.aa.com/homePage"
System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");
System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://www.aa.com/homePage.do");
driver.manage().window().getClass();
//Enter from and To Airports
driver.findElement(By.id("resevationFlighSearchFrom.originAitport")).sendKeys("AID",Keys.TAB);
driver.findElement(By.xpath("//input[contains(@id='Form.destinationAirport']")).sendKeys("JFK");
//click on the calendar and select month and year
driver.findElement(By.xpath("//input[@id=''aa-leaveingOn]")).click();

boolean flag=false;
while(!flag) {
	
String dMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div")).getText();
if(dMonth.equals("July 2020")){
List<WebElement> depCells=driver.findElements(By.xpath("//div[contains(@class,'ui-corner-left')]/following-submit"));
By.xpath("//div[contains(@class,'ui-corner-left')]/folwing-sibling::table/tbody/tr/td");
for(WebElement Cell:depCells) {
	String cellText=Cell.getText();
	if(cellText.equals("14")) {
		flag=true;
		break;
	}
}

}else {
	
driver.findElement(By.xpath("//a[@title='Next']")).click();	
}
Thread.sleep(200);	
}
while(!flag) {
String rMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div")).getText();
if(rMonth.equals("November")){
List<WebElement> returnCells=driver.findElements(By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td"));

for(WebElement returnCell:returnCells) {
String returnText=returnCell.getText();
if(returnText.equals("8")) {
	returnCell.click();
	flag=true;
	break;
}
}
}else {
driver.findElement(By.xpath("//a[@title='Next']")).click()	;
}
Thread.sleep(1000);
}
Thread.sleep(5000);
driver.quit();
}}
