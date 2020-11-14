package testNG3FrameworkEnh;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ng.Utils.CommonMethods;
import com.ng.Utils.ConfigsReader;

import testNG3FrameworkEnh.AddEmployeePageElements;

public class AddEmployeeTest extends CommonMethods {





@BeforeMethod
public void openBrowser() {
setUp();
initialize();
}
@AfterMethod
public void closeBrowser() {
tearDown();
}
@Test
public void addEmployeePage () throws InterruptedException {
	
	
login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
dashboard.navigateToAddEmployee();
wait(7);	

}
}


