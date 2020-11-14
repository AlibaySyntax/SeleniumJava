package testNG1Intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnnotation {




@BeforeSuite
public void beforeSuite () {
//BayramGul();
System.out.println("Before Suite");
}
@AfterSuite
public void afterSuite () {
System.out.println("After Suite");
}
@BeforeTest
public void beforeTest () {
//BayramGul();
System.out.println("Before Test");
}
@AfterTest
public void afterTest () {
System.out.println("After Test");
}
@BeforeClass
public void beforeClass () {
System.out.println("Before Class");
}
@AfterClass
public void afterClass() {
System.out.println("After Class");	
}	
@BeforeMethod
public void beforeMethod() {
BayramGull();
System.out.println("Before Method");
}
@AfterMethod
public void afterMethod() {
System.out.println("After Method");
}
@Test
public void test() {
System.out.println("Actual Test is running..args.");
}
public void BayramGull() {
System.out.println("Hi from Bayramgul");
}
}


