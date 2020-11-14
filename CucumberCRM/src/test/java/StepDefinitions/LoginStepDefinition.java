package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
WebDriver driver;

@Given("user is already on Login Page")
public void user_is_already_on_Login_Page() {
System.setProperty("webdriver.chrome.driver","/Users/naveenkhuteta/Downloads/chromedriver");
driver =new ChromeDriver();	
driver.get("htpps://www.freecrm.com");
}
//***********************************************
@When ("title_of_login_page_is_free_CRM")
public void title_of_login_page_is_free_CRM() {
String title=driver.getTitle();	
System.out.println(title);
Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
}
//***********************************************
@Then ("user enters email  and  password")
public void user_enters_email_and_password(){
driver.findElement(By.name("email")).sendKeys("aitov.74@list.ru");
driver.findElement(By.name("password")).sendKeys("Tuzik1234");
}
//***********************************************
@Then ("user clicks on Login button")
public void user_clicks_on_Login_button() {
WebElement loginBtn=driver.findElement(By.xpath("//*[@id='submit']/div/div/form/div/div[3]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("argument[0]", loginBtn);
}
//***********************************************
@Then("user is on home page")
public void user_is_on_home_page() {
String title=driver.getTitle();
System.out.println("Home page title:: "+title);
Assert.assertEquals("Cogmento CRM", title);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
