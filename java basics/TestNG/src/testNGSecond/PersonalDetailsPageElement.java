package testNGSecond;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.BaseClass;

//import sun.jvm.hotspot.debugger.cdbg.BaseClass;

public class PersonalDetailsPageElement {

@FindBy(id="personal_cmbNation")
public WebElement nationalityDD;

@FindBy(name="personal[optGender]")
public List<WebElement>genderRadioGroup;

public PersonalDetailsPageElement() {
PageFactory.initElements(BaseClass.driver, this);
}
}
