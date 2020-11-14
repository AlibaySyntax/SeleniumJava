package hrms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrms.testBase.BaseClass;

public class ViewEmployeePageElements {

@FindBy(id="empsearch_employee_name_empName")
public WebElement empName;

@FindBy(id="empsearch_id")
public WebElement empID;

@FindBy(id="empsearch_Bttn")
public WebElement searchBttn;

public ViewEmployeePageElements () {
PageFactory.initElements(BaseClass.driver, this);
	
}
}
