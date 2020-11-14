package Rew3Calendar;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.wait;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selUtils.CommonMethods;

public class CalendarHandling extends CommonMethods {

public static void main(String[] args) throws Throwable    {
		
System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/");	
WebElement datePickerLink=driver.findElement(By.xpath("//a[text()='datepicker']"));
wait(2);
datePickerLink.click();
WebElement frame=driver.findElement(By.className("demo-frame"));
driver.switchTo().frame(frame);
WebElement calendar=driver.findElement(By.id("datepicker"));
//click(calendar);
calendar.click(); 
String departMonth="August 2020";
WebElement month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
//boolean flag =true;
while(true) {
String monthText=month.getText();
if(!departMonth.equals(monthText)) {
nextButton.click();
}else{
break;
}
}
List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']"));
selectCalendarDate(dates,"10");
driver.switchTo().defaultContent();

TakesScreenshot ts=(TakesScreenshot)driver;
File pic=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(pic,new File("/screenshots/HRMS/calendar.png"));
driver.quit();
// To handle window based pop ups and upload files you can use RObot class AutoIT
}
}
