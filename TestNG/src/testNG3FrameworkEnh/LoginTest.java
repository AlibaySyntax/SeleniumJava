package testNG3FrameworkEnh;
//import org.testng.DashboardPageElements;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.CommonMethods;
import Utils.ConfigsReader;


public class LoginTest extends CommonMethods {
	
//@BeforeMethod
//public void openBrowser() {
//setUp();
//initialize();
////}
////private void initialize() {	
//}
//@AfterMethod
//public void closeBrowser() {
//tearDown();	
//}
//	
@Test
public void  validAdminLogin() {
//LoginPageElements login=new LoginPageElements();
sendText(login.username,ConfigsReader.getProperty("username"));
sendText(login.password,ConfigsReader.getProperty("password"));
click(login.loginBttn);

//DashboardPageElements dashboard=new DashboardPageElements();
String exceptedUser="Welcome Admin";
String actualUser=dashboard.welcome.getText();
Assert.assertEquals(actualUser, exceptedUser,"Admin is Not logged in");  //  org.testng.
Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));

}
@Test
public void invalidPasswordLogin() {
//LoginPageElements login=new LoginPageElements();
sendText(login.username,ConfigsReader.getProperty("username"));
sendText(login.password,"uiuguig");

String expected="Invalid credentials";
Assert.assertEquals(login.errorMsg.getText(),expected,"Error message text is not matched");

}
@Test(enabled=true)
public void emptyUsernameLogin() {
//LoginPageElements login=new LoginPageElements();
sendText(login.password,ConfigsReader.getProperty("password"));
click(login.loginBttn);

String expected="Username cannot be empty";
Assert.assertEquals(login.errorMsg.getText(),expected,"Error message text is");

}
}
