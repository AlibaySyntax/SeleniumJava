package Sel01INTRO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LunchChrmeBrowser {

public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
WebDriver driver=new ChromeDriver();

driver.get("https//www.google.com");

String url=driver.getCurrentUrl();

System.out.println(url);

System.out.println(driver.getTitle());


}

}
