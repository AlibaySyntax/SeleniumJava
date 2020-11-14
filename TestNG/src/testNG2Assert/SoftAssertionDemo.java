package testNG2Assert;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utils.CommonMethods;
import Utils.ConfigsReader;

import testNG3FrameworkEnh.LoginPageElements;

public class SoftAssertionDemo extends CommonMethods {

// Open Application
// Verify logo is displayed
// Enter valid credentials
// Verify user successfully logged in, 
// by verifying welcome message

@BeforeMethod
public void openBrowserAndNavigate() {
setUp();	
}
@AfterMethod
public void quitBrowser() {
tearDown();
}
@Test
public void logoAndWelcomeValidation() {
LoginPageElements login=new LoginPageElements();

// Logo assertion
login.logo.isDisplayed();
boolean logoDisplayed=login.logo.isDisplayed();

// I am failing on purpose
logoDisplayed=false;

// If i do a (hard) Assert,the code will not continue executing.
// -> Assert.assertTrue(logoDisplayed,"Logo is not displayed" );

// If i do a (soft) Assert,the code will not continue executing.
SoftAssert soft=new SoftAssert();
soft.assertTrue(logoDisplayed,"Logo is not displayed");
System.out.println("After first assertion ");

// Logging in
sendText(login.username,ConfigsReader.getProperty("username"));
sendText(login.password,ConfigsReader.getProperty("password"));
click(login.loginBttn);

//Welcome msg assertion
boolean msgDisplayed=dashboard.welcome.isDisplayed();
//-> Assert.assertTrue(msgDisplayed,"Welcome msg not displayed");
soft.assertTrue(msgDisplayed, "Welcome msg not displayed");

// This will collect all soft assertions add then decide if TC passed or failed
soft.assertAll();

// Execution stops after assertAll
// This statement will not be executed
System.out.println("After assertAll");





}	
}
