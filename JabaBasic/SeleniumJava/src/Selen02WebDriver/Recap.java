package Selen02WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Recap {

public static void main(String[] args) {

String fbUrl="https//www.facebook.com";
System.setProperty("webdriver.chrome.driver", "driver/chromedriver");//window users add.exe		
ChromeDriver driver=new ChromeDriver();

driver.get(fbUrl);
String url= driver.getCurrentUrl();
System.out.println("Current URL is: "+url);
String title=driver.getTitle();
System.out.println("Title of the page is: "+title);

driver.close();





}

}
