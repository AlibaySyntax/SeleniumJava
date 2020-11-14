package testNG4Groups;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.CommonMethods;

import org.testng.annotations.*;

public class DemoProvideDemo extends CommonMethods {
		
@Test(dataProvider="getData")
public void login(String username, String password, int age) {
	
System.out.println(age);
sendText(login.username,username);
sendText(login.password,password);
click(login.login.loginBttn);

boolean isdisplayed=dashboard.welcome.isDisplayed();
Assert.assertTrue(isdisplayed, "Welcom msg is not dispayed");	
}
    //This Method that has a @DataProvider annotation
    //should return a 2D-Array
@DataProvider
public Object[][] getData() {
	
    // This is like doing the followimg three steps
//login("Admin","Hum@nhrm123",23);
//login("Syntax", "Syntax123!",20);
//login("SyntaxUser","Syntax123!",25);

    //The number of rows will decide how times the test will run
    //The columns of each row are bound/pass as parameter to Test Case
Object[][] data= {
{"Admin","Hum@nhrm123",23},
{"Syntax", "Syntax123!",20},
{"SyntaxUser","Syntax123!",25},
};

    //2nd Way
//Object[][] data2=new Object[3][3];
//data2[0][0]="Admin";
//data2[0][1]="Hum@nhrm123";
//data2[0][2]=23;
//
//Object[][] data3=new Object[3][3];
//data3[1][0]="Syntax";
//data3[1][1]="Syntax123!";
//data3[1][2]=20;
//
//Object[][] data4=new Object[3][3];
//data4[2][0]="SyntaxUser";
//data4[2][1]="Syntax123!";
//data4[2][2]=25;

return data;
}
}


