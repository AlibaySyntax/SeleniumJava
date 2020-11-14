package Rew2SwitchToCommandsWaitsAndWebTable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
WebDriver driver=new ChromeDriver();
driver.get("http://testingpool.com/data-types-in-java/");

List<WebElement>rows=driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr"));
int rowNums=rows.size();
System.out.println("Total row number is "+rowNums);

List<WebElement> cols=driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr[1]/td"));
int colNums=cols.size();
System.out.println("Total row number is "+colNums);

for(int j=1; j<=rows.size();j++) {
for(int i=1; i<=cols.size();i++) {
WebElement cellData=driver.findElement(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr["+j+"]/td["+i+"]"));
String cellDataText=cellData.getText();
//System.out.println(cellDataText);
if(i==2) {
System.out.println(cellDataText);
}
}
}




}

}
