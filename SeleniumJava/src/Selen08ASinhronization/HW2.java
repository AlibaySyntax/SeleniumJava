package Selen08ASinhronization;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;

import selUtils.BaseClass;
public class HW2 extends BaseClass {

//private static final String SeleniumSetting = null;

public static void main(String[] args, Object dron) {
		
	String url="http://166.62.36.207/syntaxpractice/table-search-filter-demo.html";
	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");
	
	WebDriver driver=diver.driver("chrome", url);
	System.out.println("========Row Data================");
	List<WebElement> row=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
	System.out.println("Number of Rows in 2nd Table is "+row.size());
	Iterator<WebElement> it=row.iterator();
	while(it.hasNext()) {
		String rowText=it.next().getText();
		System.out.println(rowText+"\n");
	}
	System.out.println("========Column Data================");
	List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table']//thead[@class='thead-inverse']//th"));
	System.out.println("Number of Column in 2nd Table is "+cols.size());
	for (WebElement col:cols) {
		String textCol=col.getText();
		System.out.print(textCol+" || ");
	}
	dron.tearDown();
}}

