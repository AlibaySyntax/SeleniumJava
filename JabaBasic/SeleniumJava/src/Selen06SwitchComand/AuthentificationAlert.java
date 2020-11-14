package Selen06SwitchComand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selUtils.BaseClass;

public class AuthentificationAlert {

public static void main(String[] args) {
WebDriver driver =new BaseClass.setUp();	
	
/*Actual url=http://abcdatabase.com/basicauth
* userName=test
* password=test
*/
//Making connection to the driver	
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
WebDriver driver =new ChromeDriver();
driver .get("http:/test:test@abcdatabase.com/basicauth");	
}
}
