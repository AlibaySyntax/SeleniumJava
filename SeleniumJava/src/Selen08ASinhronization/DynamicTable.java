package Selen08ASinhronization;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selUtils.BaseClass;

//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import selUtils.BaseClass;

public class DynamicTable extends BaseClass {

public static void main(String[] args  ) {
		
setUp();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
driver.findElement(By.id("ctl00_MainContent_login_button")).click();

String expectValue="Bob Feather";

WebElement table=driver.findElement(By.id(("ctl00_MainContent_ordergrid")));
List<WebElement> rows=table.findElements(By.tagName("//tr"));

//List<WebElement>rows=driver.findElement(By.xpath("//table[@id='ctl00_MaiContent_orderGrid']//td[1]")).get(i).click();
for(int i=0; i<=rows.size(); i++);
String rowText=rows.get(i+1).getText();
System.out.println(rowText);
if(rowText.contains(expectValue)) {//search for Bob Feather
//Get the rows of 
driver.findElement(By.xpath("//table[@id='ctl00_main_Content_orderGrid']//td[1]")).get().click();
}
Thread.sleep(2000);
driver.close();
}}



