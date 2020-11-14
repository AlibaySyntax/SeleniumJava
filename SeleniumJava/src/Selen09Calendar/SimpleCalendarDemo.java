package Selen09Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selUtils.BaseClass;
import selUtils.CommonMethods;
import selUtils.ConfigsReader;

//import com.syntax.Utils.BaseClass;
//import com.syntax.Utils.CommonMethods;
//import com.syntax.Utils.ConfigsReader;

public class SimpleCalendarDemo extends BaseClass {

public static void main(String[] args) throws InterruptedException {
/*Step
 * 		
 */
	//http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
setUp();
driver.findElement(By.id("txtUserName")).sendKeys(ConfigsReader.getProperty("uername"));
driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
driver.findElement(By.id("btnlogin")).click();
//Navigate to leave list
CommonMethods.waitForClickability(driver.findElement(By.linkText("Leave")));
driver.findElement(By.linkText("Leve")).click();
driver.findElement(By.linkText("Leve List")).click();
//click on calendar
CommonMethods.waitForClickability(driver.findElement(By.id("calFromeDate")));
//driver.findElement(By.id("calFromeDate")).click();

WebElement mDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
CommonMethods.selectDdValue(mDD, "Apr");

WebElement yDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
CommonMethods.selectDdValue(yDD, "2021");

//select day from the calendar
List<WebElement> FromDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-month']"));

for(WebElement FromDay:FromDate) {
Thread.sleep(5000);
	
}





}
}
