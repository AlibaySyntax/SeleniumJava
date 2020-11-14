package testNG2Assert;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utils.CommonMethods;
import Utils.ConfigsReader;
import Utils.Constants;


import testNG3FrameworkEnh.DashboardPageElements;
import testNG3FrameworkEnh.LoginPageElements;

public class HW extends CommonMethods {

@BeforeMethod
public void openBrowserAndNavigate () {	
setUp() ; 	
}
@AfterMethod 
public void quitBrowser() {
tearDown();	
}
// 1st way
// @Test(priority=2, dependsOnMethods= {"invalidLogin"})// ->@Test(priority=2, dependsOnMethods={"invalidLogin","anotherMethod"})
// 2nd way
// @Test(priority=2, dependsOnMethods= {"invalidLogin"})
// depending on multiple methods
// @Test(priority=2, dependsOnMethods= {"invalidLogin", "method", "method3"})

@Test(priority=2, dependsOnMethods= {"invalidLogin"})
public void validLogin() throws InterruptedException  {

//WebElement username=driver.findElement(By.id("txtUsername"));
// 1st way
// username.sendKeys(ConfigsReader.getProperty("username"));
// 2nd way
// sendText(username,ConfigsReader.getProperty("username"));
 
// 3rd way, using Page Object Model and PageFactory
LoginPageElements login=new LoginPageElements ();
sendText(login.username,ConfigsReader.getProperty("username"));

sendText(login.password,ConfigsReader.getProperty("password") );

// 1st way
WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_WAIT_TIME);
wait.until(ExpectedConditions.elementToBeClickable(login.loginBttn));
login.loginBttn.click();

// 2nd way
waitForClickability(login.loginBttn);
login.loginBttn.click();

// 3rd way
click(login.loginBttn);              //login.logo.isDisplayed();

DashboardPageElements dashboard =new DashboardPageElements ();
boolean displayed = login.logo.isDisplayed();
if(displayed) {
System.out.println("logo is displayed");
}else {
System.out.println("Logo not is displayed");
}
// 1st way

// try {
// Thread.sleep(2000);
// }catch(InterruptedException e) {
// e.printStackTrace();
// }
wait ();
}
// @Test means Test Case =Scenario = Test Method
// Case 1: if this test method is commented, it will not run
// Depending method will throw an exception
// @Test(priority=3,enabled=true)

//@Test means Test Case =Scenario = Test Method
//Case 2: if this test method is commented, it will not run
//Depending method will throw an exception
//@Test(priority=3,enabled=false)

@Test(priority=3,enabled=true)
public void invalidLogin() throws Exception {
LoginPageElements login=new LoginPageElements();
sendText(login.username,"Admin");
sendText(login.username,ConfigsReader.getProperty("username"));
click(login.loginBttn);

String expectedText="Password cannot be empty";
String actualText=login.errorMsg.getText();
boolean errorDisplayed=login.errorMsg.isDisplayed();

if(errorDisplayed) {
   System.out.println("Error msg is displayed");

if(expectedText.equals(actualText)) {
   System.out.println("Error msg is correct");
}else {
   System.out.println("Error msg is NOT correct ");
}
}else {
   System.out.println("Error msg is NOT displayed");	
}
wait(1);

// When an Exception is thrown, the test fails
throw new Exception();






}
}
