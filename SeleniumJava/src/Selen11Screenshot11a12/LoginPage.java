package Selen11Screenshot11a12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selUtils.CommonMethods;




public class LoginPage extends CommonMethods {
	
	
	
public WebElement username=driver.findElement(By.id("txtUsername"));

public WebElement password=driver.findElement(By.id("txtpassword"));

public WebElement loginBtn=driver.findElement(By.id("btnLogin"));


}
