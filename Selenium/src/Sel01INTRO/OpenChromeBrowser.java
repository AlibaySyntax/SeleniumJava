package Sel01INTRO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

public static void main(String[] args) throws InterruptedException {
//FirefoxDriver driver1=new FirefoxDriver();// No working ALWAYS
	
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
WebDriver driver=new ChromeDriver();//go ahead and open chrome browser

//driver.get("https://syntaxtechs.com");
//driver.get("https://google.com");
driver.get("https://facebook.com");

String url=driver.getCurrentUrl();
String expectedUrl="https://www.facebook.com/";
if(url.equalsIgnoreCase("https://facebook.com/")) {
String title=driver.getTitle();
System.out.println(title);
}else {
	System.out.println("Wrong Url is returned");
//System.out.println(url);
//Thread.sleep(2000);
//driver.close();
	
}}}