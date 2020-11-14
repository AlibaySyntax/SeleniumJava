package testBase;

import Pages.AddEmployeePageElements;
import Pages.DashboardPageElements;
import Pages.LoginPageElements;
import Pages.PersonalDetailsPageElement;
import Pages.ViewEmployeePageElements;
import Steps.SauceDemoLoginSteps;

public class PageInitializer extends BaseClass {
	
// initialize all pages class and stores reference in static variable
// that will called/used in test classes	
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
 