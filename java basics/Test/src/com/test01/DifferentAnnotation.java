package com.test01;

import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DifferentAnnotation {

	


@BeforeSuite
public void beforeMethod1() {
//BayramGul();
System.out.println("Before Method");
}
@AfterSuite
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
@Test
public void test() {
System.out.println("Actual Test is running..args.");
}

}


