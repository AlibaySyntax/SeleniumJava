package hrms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrms.Utils.CommonMethods;
import hrms.testBase.BaseClass;

public class DashboardPageElements extends CommonMethods {

@FindBy(id="welcome")
public WebElement welcome;

@FindBy(xpath="//div[@id='branding']/a[1]/img")
public WebElement logo;

@FindBy(xpath="//div[@id='menu_pim_addEmployee']")
public WebElement addEmp;

@FindBy(xpath="//a[@id='menu_pim_viewPimmodule']/b")
public WebElement PIM;

public DashboardPageElements() {
PageFactory.initElements(BaseClass.driver, this);
}
public void navigateToAddEmployee() {
click(PIM);
click(addEmp);
//jsClick(PIM);
//jsClick(addEmp);

}

	
	
}

