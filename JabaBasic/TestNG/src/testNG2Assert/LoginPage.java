package testNG2Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ng.Utils.CommonMethods;
public class LoginPage extends com.ng.Utils.CommonMethods {
	
	
	
	
	
public WebElement username=driver.findElement(By.id("txtUsername"));

public WebElement password=driver.findElement(By.id("txtpassword"));

public WebElement loginBtn=driver.findElement(By.id("btnLogin"));


}
