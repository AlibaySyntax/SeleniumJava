package Steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cuUtils.CommonMethods;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;



public class DashboardSteps extends CommonMethods {
	
@Then("user see dashboard menu is displayed")
public void user_see_dashboard_menu_is_displayed(DataTable dashboardMenu) {
	
List<String>expectedMenu=dashboardMenu.asList();
List<String>actualMenu=new ArrayList<>();

for (WebElement el:dashboard.dashMenu) {
actualMenu.add(el.getText());	
}
System.out.println(expectedMenu);
System.out.println(actualMenu);
Assert.assertTrue(actualMenu.equals(expectedMenu));
}

}
