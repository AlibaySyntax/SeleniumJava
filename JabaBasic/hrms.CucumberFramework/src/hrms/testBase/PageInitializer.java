package hrms.testBase;

import hrms.Pages.AddEmployeePageElements;
import hrms.Pages.DashboardPageElements;
import hrms.Pages.LoginPageElements;
import hrms.Pages.PersonalDetailsPageElement;
import hrms.Pages.ViewEmployeePageElements;
import hrms.Steps.SauceDemoLoginSteps;

//initialize all pages class and stores reference in static variable
//that will called/used in test classes
public class PageInitializer extends BaseClass {
	
public static LoginPageElements login;
public static AddEmployeePageElements addEmp;
public static DashboardPageElements dashboard;
public static PersonalDetailsPageElement pdetails;
public static ViewEmployeePageElements  viewEmp;
public static SauceDemoLoginSteps sauceLogin;

public static void initialize() {

login=new LoginPageElements();
dashboard=new DashboardPageElements();
addEmp= new AddEmployeePageElements();
pdetails=new PersonalDetailsPageElement();
viewEmp=new ViewEmployeePageElements();
sauceLogin=new  SauceDemoLoginSteps();
}
}
 