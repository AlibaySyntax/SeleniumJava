package Steps;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import cuUtils.ConfigsReader;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends cuUtils.CommonMethods {

	@When("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_creaentioals() {
	sendText(login.username,ConfigsReader.getProperty("sername"));	
	sendText(login.username,ConfigsReader.getProperty("password"));
	click(login.loginBttn);
	}
	//****************************************************
	@When("user enter valid admin username and password")
	public void user_enter_valid_admin_username_and_password() {
	// Write code here that turns the phrase above into concrete actions
	login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
	//throw new io.cucumber.java.PendingException();
	}
	//****************************************************
	@When("user click on login button")
	public void user_click_on_login_button() {
	// Write code here that turns the phase into concrete actions
	//throw new io.cucumber.java.PendingException();
	}
    //****************************************************
	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
	String expected="Welcom Admin";
	String actual=dashboard.welcome.getText();
	Assert.assertEquals(actual, expected,"Welcome is not displayed or not correct");
	System.out.println(actual);
	//wait(3);
	//tearDown();
	}
	//****************************************************
	@When("user enter valid ess username and password")
	public void user_enter_valid_ess_username_and_password() {
	login.login("Elvira","Syntax123");
	}
	//****************************************************
	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
	String expected ="Welcome Elvira";
	String actual=dashboard.welcome.getText();
	Assert.assertEquals(actual, expected, "Welcome message is not displayed or not correct");
	System.out.println(actual);
	wait(3);
	tearDown();	
	}
	//****************************************************
	@When("User enter valid  username and invalid password")
	public void user_enter_valid__username_and_invalid_password() {
	sendText(login.username,"Elvira");
	sendText(login.password,"syntax123...");	
	}
	//****************************************************
	@Then("User see invalid Credentials text on login page")
	public void user_see_invalid_Credentials_text_on_login_page() {
	}
	//****************************************************
	@When("user enter {string} and {string}")
	public void user_enter_valid_and(String username,String password) {
	sendText(login.username,username);
	sendText(login.password,password);
	}
	//****************************************************
	@Then("user see {string}")
	public void user_see(String errorMessage) {
	Assert.assertEquals("Not correct error messge is displayed",errorMessage,login.errorMsg.getText());		
	}
	//****************************************************
	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String string) {
		
	}
	//****************************************************
	@When("I enter invalid username and password and see error massage")
	public void i_enter_invalid_username_and_password_and_see_error_massage(DataTable dataTable, DataTable invalidCredentials,String actual ) {
	List<Map<String,String>>list=invalidCredentials.asMaps();
	for(Map<String,String>map:list) {
    sendText(login.username,map.get("UserName"));
	sendText(login.password,map.get("Password"));
	click(login.loginBttn);
	Assert.assertEquals("Not correct error message is displayed",map.get("Error Message"),login.errorMsg.getText());
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
