package testNG3FrameworkEnh;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ng.Utils.CommonMethods;
import com.ng.Utils.ConfigsReader;

import testNG5.ExcelUtility;

public class HWObjectArray extends CommonMethods{

@Test(dataProvider="userData")
public void test(String firstName, String lastName,String username, String password) {
System.out.println(firstName+""+lastName);	
// login intro HRMS
login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
//add emp page
dashboard.navigateToAddEmployee();
wait(1);

// add employee  information
sendText(addEmp.firstName,firstName);
sendText(addEmp.lastName,lastName);
// get EmployeeID
String expectedEmpId= addEmp.EmployeeId.getAttribute("value");
click(addEmp.checkboxLoginDetails);
wait(1);
//Click on Create Login Details
sendText(addEmp.username,username);
sendText(addEmp.password,password);
sendText(addEmp.confirmPassword,password);
click(addEmp.saveBtn);
// Take screenshot
takeScreeenshot(firstName+"_"+lastName);
}
@DataProvider(name="userData")
public Object[][]getData(){
Object [][]Data= {
{"Raj","Cappoor","rai123","Amirkhan_@123"},
{"John","Smith","john123","Amirkhan_@123"},
{"Mary","Ann","mary123","Amirkhan_@123"},
{"Rohani","Sakhi","rohani123","Amirkhan_@123"},
};
return Data;
}
@DataProvider(name="userDataFromExcel")
public Object[][]getData2(){
return	ExcelUtility.excelIntoArray(System.getProperty("user.dir")+"/testdat/Excel.xlsx", "Employee");
	
}
}
