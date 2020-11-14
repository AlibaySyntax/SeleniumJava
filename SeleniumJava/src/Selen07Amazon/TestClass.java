package Selen07Amazon;

import java.io.IOException;

import selUtils.BaseClass;

public class TestClass extends BaseClass {

public static void main(String[] args) throws IOException {
	
setUp();

String title=driver.getTitle();
System.out.println(title);

tearDown();
}
//public static void select(int i) {	
//}
//public static void select(String i) {
//	
//}
}

