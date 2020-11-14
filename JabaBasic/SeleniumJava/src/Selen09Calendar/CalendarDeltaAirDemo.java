package Selen09Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selUtils.BaseClass;

//import com.syntax.Utils.BaseClass;

public class CalendarDeltaAirDemo extends BaseClass {

public static void main(String[] args) throws InterruptedException {
		
setUp();
//Click on 
driver.findElement( By.xpath("//span[@id='caldepartlableCont")).click();
String dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
while(!dMonth.equals("August")) {
driver.findElement(By.xpath("//span[text()='Next'")).click();
Thread.sleep(2000);
dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
}
//loop through td and grab the text
List<WebElement>fromCells=driver.findElements(By.xpath("//tbody[@class='dl-datepcker-today-0']/tr/td"));

for(WebElement departCell:fromCells) {
String fromText=departCell.getText();
if(fromText.equals("15")) {
departCell.click();
break;
}
}
//grab the next of return month and check if it equals to October
String returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();

while(!returnMonth.equals("October")){
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(2000);	
returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
}

List<WebElement>returnCells=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-today']"));

for(WebElement returnCell:returnCells) {
	String returnText=returnCell.getText();
	if(returnText.equals("9")) {
  returnCell.click();
		break;
	}
}
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@value='done']")).click();
Thread.sleep(5000);
tearDown();
}
}
