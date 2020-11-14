package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cuUtils.CommonMethods;
import testBase.BaseClass;


public class PersonalDetailsPageElement extends CommonMethods{



@FindBy(id="personal_cmbNation")
public WebElement nationalityDD;

@FindBy(name="personal[optGender]")
public List<WebElement>genderRadioGroup;

@FindBy(xpath="//div[@id='pdMainContainer']/div[1]/h1")
public WebElement lblPersnalDetails;

@FindBy(id="personal_txtEmployeeId")
public WebElement employeeId;

@FindBy(xpath="//div[@id='profile-pic']//h1")
public WebElement profilePic;

@FindBy(xpath="//div[@id='profile-pic']--this wrong---")// <-- This wrong 
public WebElement profileName;

public PersonalDetailsPageElement() {
PageFactory.initElements(BaseClass.driver, this);
}
}
