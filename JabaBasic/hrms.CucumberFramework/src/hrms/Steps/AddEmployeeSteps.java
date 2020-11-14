package hrms.Steps;

import java.util.List;
import java.util.Map;

import hrms.Utils.CommonMethods;
import hrms.Utils.ConfigsReader;
import hrms.Utils.Constants;
import hrms.Utils.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddEmployeeSteps extends CommonMethods {

@Given("user navigates to AddEmployee")
public void user_navigate_to_AddEmployee() {
dashboard.navigateToAddEmployee();//navigateToAddEmployee	
}
//****************************************************
// This  method has hardcoded values
@Given("user enters employee first name and last name")
public void user_enters_employee_first_name_and_last_name() {
sendText(addEmp.firstName,"James");
sendText(addEmp.lastName,"Smith");	
}
//****************************************************
// This  enhanced method and parameter values are supplied from FF
@Given("user enters employee {string} and {string}")
public void user_enters_employee_first_name_and_last_name(String firstName,String lastName) {
sendText(addEmp.firstName,firstName);
sendText(addEmp.lastName,lastName);	
}
//****************************************************
@When("user clicks save button")
public void user_clicks_save_button() {
click(addEmp.saveBtn);	
}
//****************************************************
@When("user enter employees{string},{string} and {string}")
public void enteringEmployee(String fName,String mName, String lName) {
sendText(addEmp.firstName,fName);
sendText(addEmp.middleName,mName);
sendText(addEmp.lastName,lName);
}
//****************************************************
@Then ("{string},{string}and{string}is added successfully")
public void and_is_added_successfully(String fname,String MiddleName,String laName) {
System.out.println("I added the employee !!!!!!!!!!!!!!!!!!!");	
wait(2);	
}
//****************************************************
@When("user enters employee details and click on save then employee is added")
public void user_enters_employee_details_and_click_on_save(DataTable dataTable, String expected) {
// Write code here that turns the phase above into concrete actions
// For automatic transformation, change DataTable to one of
// E, List<E>,List<List<E>>,List<Mar<K,V>>,Map<K,V> or
// Mar<K,List<V>>,E,K,V must be a String, Integer,Float,
// Double, Byte, Short, Long, BigInteger or BigDecimal.
//
// For other transformations you can register a DataTabletype
List<Map<String,String>>AddEmployeeList=dataTable.asMaps();
for(Map<String,String>map:AddEmployeeList) {
	
String fname=map.get("FirstNmae"); //<-Another way-- System.out.println(map.get("FirstName"));
String mname=map.get("MiddleNmae");//<-Another way-- System.out.println(map.get("MiddleName"));
String lname=map.get("LastNmae");  //<-Another way-- System.out.println(map.get("LastName"));
sendText(addEmp.firstName, fname);
sendText(addEmp.middleName, mname);
sendText(addEmp.lastName, lname);
click(addEmp.saveBtn);

// Adding assertion
String actual=pdetails.profilePic.getText();
Assert.assertEquals("Employee is not added successfully",expected,actual);
jsClick(dashboard.addEmp);
wait(5);
}
}
//****************************************************
@Then("emploee is added successfully")
public void employee_is_added() {
System.out.println("------Employee is added using datatable");	
}
//****************************************************
@When("user enters employee data from {string} excel sheet then employee is added")
public void user_enters_employee_data_from_excel_sheet_then_employee_is_added(String sheetName) {
List<Map<String,String>>excelList=ExcelUtility.excelIntoListOfMaps(Constants.TESTDATA_FILEPATH, sheetName);
}
//****************************************************
// This method has hardcoded value
@Then("employee is added successfully")
public void employee_is_added_successfully() {
String actual=pdetails.profilePic.getText();
String expectedName="James Smith";
Assert.assertEquals(expectedName, actual);
}
//*****************************************************
// This method is enhandced method and parameter values are supplied from FF
@Then("employee is added successfully")
public void employee_is_added_successfully(String expectedName) {
String actual=pdetails.profilePic.getText();
String expected="Atacan Ana";
Assert.assertEquals(expectedName, actual);
}
//*****************************************************
@When ("user deletes employee id")
public void user_deletes_employee_id() {
addEmp.EmployeeId.clear();	
}
//*****************************************************
@When("user clicls on create login checkbox")
public void user_clicls_on_create_login_checkbox() {
click(addEmp.checkboxLoginDetails);
//jsClick(addEmp.checkboxLoginDetails); <-- must be this is
}
//*****************************************************
@When("user enters login credentials")
public void user_enters_login_credentials() {
addEmp.createEmpLoginCR();	
}
}
