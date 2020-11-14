package testNG1Intro;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ng.Utils.CommonMethods;
import com.ng.Utils.ConfigsReader;


public class TitleLogoAndLoginValidation extends CommonMethods {
@BeforeMethod
public void openAndNavigate()  {
setUp();
//Thread.sleep(2000);
}

@AfterMethod
public void QuitBrowser() {
tearDown();
}

//@Test
public void TitleVlogovalidation() throws InterruptedException {
String expectedTitle="Human Management System ";
String actualTitle=driver.getTitle();
if(expectedTitle.equals(actualTitle)) {
System.out.println("titleValidation passed");
}else{
System.out.println("titleValidation failed");
}
Thread.sleep(2000);
}

//@Test
public void logovalidation() throws Exception  {
String logoPath="//div[@id=divLogo]/img";
WebElement logo=driver.findElement(By.xpath(logoPath));
boolean isDisplayed=logo.isDisplayed();
if(isDisplayed) {
System.out.println("logoValidation passed");
}else {
System.out.println("logoValidation failed");
throw new Exception();
}
Thread.sleep(2000);
}

@Test
public void Validation() throws InterruptedException {
WebElement username=driver.findElement(By.id("txtUsername"));
//sendText(username,"Admin");
sendText(username,ConfigsReader.getProperty("username"));
WebElement password=driver.findElement(By.id("txtPassword"));
sendText(password,ConfigsReader.getProperty("password"));

click(driver.findElement(By.id("btnlogin")));
// HW
// Validate that Welcome Admin is displayed
// Check the reports in "test-output" folder
Thread.sleep(2000);









}
}