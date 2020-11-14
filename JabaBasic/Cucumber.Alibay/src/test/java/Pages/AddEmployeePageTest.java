package Pages;

import org.junit.Test;
import org.testng.annotations.DataProvider;

//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

import Utils.CommonMethods;
import Utils.Constants;
import Utils.ExcelUtility;
public class AddEmployeePageTest extends CommonMethods {

@Test(dataProvider="getData",groups= ("regression")
public void addMultipleEmployee(String firstName,String middleName,String lastname) throws InterruptedException {

	
test.info("Login in into HRMS")
login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
DashboardPageElements dashboard=new DashboardPageElements() ;
test.info("Navigating to the add Employee Page");
dashboard.navigateToAddEmployee();
//wait();

test.info("Adding employee");
AddEmployeePageElements addEmp=new AddEmployeePageElements();
test.info("Login in into HRMS");
sendText(addEmp.firstName,firstName);
sendText(addEmp.middleName,middleName);
sendText(addEmp.lastName,lastName);
String empId=addEmp.getAttribute("value");

Thread.sleep(1000);
click(addEmp.saveBtn);
test.info("Validating Emploee is added");
PersonaldetailsPageElements pdw=new PersonaldetailsPageElements();

WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOf(pdw.empId));
String  actEmpId=pdw.empId.getAttribute("value");
Assert.asertEquals(actEmpId,empId);

@DataProvider
public Object[][] getData(){
return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "AddEmployee");	
}
}



