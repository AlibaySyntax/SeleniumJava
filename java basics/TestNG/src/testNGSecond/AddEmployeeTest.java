package testNGSecond;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utils.CommonMethods;
import com.Utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {





@BeforeMethod
public void openBrowser() {
setUp();
}
@AfterMethod
public void closeBrowser() {
tearDown();
}
@Test
public void  validAdminLogin() {
LoginPageElements login=new LoginPageElements();
sendText(login.username,ConfigsReader.getProperty("username"));
sendText(login.password,ConfigsReader.getProperty("password"));
sendText(login, text);
click(login.loginBtn);

AddEmployeeTest db=new AddEmployeeTest();
String exceptedUser="Welcome Admin";
String actualUser=db.welcome.getText();
Assert.assertEquals(actualUser, exceptedUser,"Admin is Not logged in");
Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
}
@Test
public void addEmployeePage() {
login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("passwowrd"));
dashboard.navigateToAddEmployee();
wait(7);

sendText(addEmp.empFirstName,ConfigsReader.getProperty("employeeFirstname"));
sendText(addEmp.empLastName,ConfigsReader.getProperty("employeeLastname"));
sendText(addEmp.addPhoto,ConfigsReader.getProperty("filePath"));
waitAndClick(addEmp.saveEmp);

// Add assertion to verify that employee has been added successfully

























}
}

