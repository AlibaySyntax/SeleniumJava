package hrms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrms.Utils.CommonMethods;
import hrms.Utils.ConfigsReader;

public class AddEmployeePageElements extends CommonMethods {
	


@FindBy(id="firstName")
public WebElement firstName;

@FindBy(id="middleName")
public WebElement middleName;

@FindBy(id="lastName")
public WebElement lastName;

@FindBy(id="EmployeeId")
public WebElement EmployeeId;

@FindBy(id="checkLogin")
public WebElement checkboxLoginDetails;

@FindBy(id="user_name")
public WebElement username;

@FindBy(id="user_password")
public WebElement password;

@FindBy(id="re_password")
public WebElement confirmPassword;

@FindBy(id="btnSave")
public WebElement saveBtn;

//public Object employeeId;

public  AddEmployeePageElements() {
PageFactory.initElements(driver, this);
}
public void createEmpLoginCR() {
sendText(username,ConfigsReader.getProperty("empUserName"));
sendText(password,ConfigsReader.getProperty("empPassword"));
sendText(confirmPassword,ConfigsReader.getProperty("empPassword"));
click(saveBtn);
}}
