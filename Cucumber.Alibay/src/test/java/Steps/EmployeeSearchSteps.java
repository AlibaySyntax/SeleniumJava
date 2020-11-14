package Steps;
import cuUtils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {

@Given("user navigate to employee list page")
public void user_navigate_to_employee_list_page() {
jsClick(dashboard.PIM);
jsClick(dashboard.empListPage);
}
@When("user enters valid employee id")
public void user_enters_valid_employee_id(String empId) {	
sendText(viewEmp.empID,empId);// <-- "10079"	
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
@When("user enter valid employee {string} and {string}")
public void user_enter_valid_employee_name_and_last_name() {

}

}