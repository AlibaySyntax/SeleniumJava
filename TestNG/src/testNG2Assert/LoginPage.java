package testNG2Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;
public class LoginPage extends CommonMethods {
	
	
	
	
	
public WebElement username=driver.findElement(By.id("txtUsername"));

public WebElement password=driver.findElement(By.id("txtpassword"));

public WebElement loginBtn=driver.findElement(By.id("btnLogin"));


}
