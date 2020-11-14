package testNG1Intro;

import org.testng.annotations.AfterMethod;

public class AfterClass {

public static void main(String[] args) {
		
}
		
@AfterMethod	
public void afterMethod1() {
System.out.println("After Method");
}
public void beforeMethod() {
//BayramGul();
System.out.println("Before Method");
}
@AfterMethod
public void afterMethod() {
System.out.println("After Method");	

}

}
