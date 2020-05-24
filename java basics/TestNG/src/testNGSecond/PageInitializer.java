package testNGSecond;
import com.Utils.BaseClass;
import com.pages.AddEmployeePageElements;

//initialize all pages class and stores reference in static variable
//that will called/used in test classes
public class PageInitializer extends BaseClass{
	
public static LoginPageElements login;
public static AddEmplyeePageElements addEmp;
public static DashboardPageElements dashboard;
public static PersonalDetailsPageElement pdetails;

public static void initialize() {

login=new LoginPageElements();
dashboard=new DashboardPageElements();
addEmp= new AddEmploeePageElements();
pdetails=new PersonalDetailsPageElements();
}
}
