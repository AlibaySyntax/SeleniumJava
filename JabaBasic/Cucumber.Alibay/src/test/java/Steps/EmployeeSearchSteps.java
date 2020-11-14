package Steps;

import cuUtils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class EmployeeSearchSteps extends CommonMethods {

//@Given("user is navigated to HRMS")
//public void user_is_navigate_to_HRMS() {
//setUp();	
//}
//@Given("user is logged with valid admin credentials")
//public void user_is_logged_with_valid_admin_credentials() {
//sendText(login.username,ConfigsReader.getProperty("username"));
//sendText(login.password,ConfigsReader.getProperty("password"));
//click(login.loginBttn);
////throw new io.cucumber.java.PendingException();	
//}
@Given("user navigate to employee list page")
public void user_navigate_to_employee_list_page() {

click(dashboard.PIM);
click(dashboard.empListPage);	
//jsClick(dashboard.PIM);
//jsClick(dashboard.empListPage);
}
@When("user enters valid employee id")
public void user_enters_valid_employee_id() {
//throw new io.cucumber.java.PendingException();	
sendText(viewEmp.empID,"10079");	
}
@When("click on search button")
public void click_on_search_button() {
//jsClick(viewEmp.searchBttn);
click(viewEmp.searchBttn);
}
@Then("user see employee information is displayed")
public void user_see_employee_information_is_displayed() {
System.out.println("Employee is displayed");
tearDown();
}
//@When("user enter valid employee name and last name")
//public void user_enter_valid_employee_name_and_last_name() {
//
//}

}