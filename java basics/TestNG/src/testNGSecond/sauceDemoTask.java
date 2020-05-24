package testNGSecond;

import org.testng.annotations.BeforeMethod;

import com.Utils.CommonMethods;

public class sauceDemoTask extends CommonMethods  {
@BeforeMethod
public void navigateToUrl() {
setUp();
}
}
