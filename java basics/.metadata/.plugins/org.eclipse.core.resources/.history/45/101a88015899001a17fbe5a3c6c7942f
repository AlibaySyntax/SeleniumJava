package Sel05DropDown;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {

public static void main(String[] args) throws InterruptedException   {
	
setUp();//Open chrome and lunch syntax Practice Site
WebElement weekDD=driver.findElement(By.id("select-demo"));

Select select=new Select(weekDD);//Object select class accept WebElement
/*
 * Selenium provides three different ways to select a value from a DD. 1.
 * 1.byIndex();
 * 2.ByVisibleText(String str):
 * ByValue();
 */
List<WebElement>options=select.getOptions();
System.out.println("Number of Options in the DD:: "+options.size());

//select.selectByIndex(3);
for(int i=1; i<options.size(); i++) {
select.selectByIndex(i);
Thread.sleep(1000);
}
select.selectByVisibleText("Friday");//Can select an option by Visible text. 
//provide the text Visible on UI
Thread.sleep(3000);
//tearDown();

}
}
