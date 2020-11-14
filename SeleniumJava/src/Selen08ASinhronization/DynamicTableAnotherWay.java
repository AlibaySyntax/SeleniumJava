package Selen08ASinhronization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selUtils.BaseClass;

public class DynamicTableAnotherWay extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		//Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		String expectValue="Bob feather";

		WebElement table=driver.findElement(By.id(("ctl00_MainContent_ordergrid")));
		List<WebElement> rows=table.findElements(By.tagName("//tr"));
		for(int i =0; i <=rows.size(); i ++);		
		String rowText=rows.get(i-1).getText();
    	//System.out.println(rowText);
		
		if(rowText.contains(expectValue)) {
		//loop through each row by providing the in the size	
		driver.findElement(By.xpath("//table[@id='ct00_MainContent_orderGrid']//td[1]")).click();
		break;
		}
		driver.close();
}
}