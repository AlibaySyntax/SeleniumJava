package Selen10Screenshots;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selUtils.BaseClass;


public class AmericAirlinesHW extends BaseClass {

public static void main(String[] args) {
	
setUp();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
///enter from to
WebElement from=driver.findElement(By.xpath("//input[@id='reservationFlightSearchFrom.originAirport']"));
from.clear();
from.sendKeys("DTW");
driver.findElement(By.xpath("//input[@name='destinatioAirport,]")).sendKeys("ORD"); //to ORD
//select number of passengers
WebElement dd=driver.findElement(By.xpath("//select[@name='adultOrSeniorPassengerCount']"));
Select select=new Select(dd);
select.selectByVisibleText("4");
//click on depart calendar
driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();
//select departure as May 14 of 2020
List<WebElement>depCells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']"));
for(WebElement depCell:depCells) {
String depText=depCell.getText();
if(depText.equals("14")) {
depCell.click();
break;
}
}
//click on arrival calendar
driver.findElement(By.xpath("//input[@name='returnDate']")).click();
//select arrival month as November
String aMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
while(!aMonth.equals("November")) {
driver.findElement(By.xpath("//a[@title='ui-datepicker-month']")).getText();
}
//select arrival date as November 8 of 2020
List<WebElement>aCells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
for(WebElement acell:aCells) {
String atext=acell.getText();
if(atext.equals("8")) {
acell.click();
break;
}
}
//click on search







}
}
