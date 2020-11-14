package RewNG5LoginPage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ng.Utils.CommonMethods;

public class SauceParameterDemo extends CommonMethods {
@Parameters({"username","password"})
@Test	
public void Login (String username,String password) {
sendText(sauceDemoPage.userNameTextBox,username);	
sendText(sauceDemoPage.passwordTextBox,password);
click(sauceDemoPage.loginButton);
wait(3);
}
}
