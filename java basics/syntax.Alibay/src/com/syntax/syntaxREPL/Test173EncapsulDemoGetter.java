package com.syntax.syntaxREPL;

public class Test173EncapsulDemoGetter {
	 
	private String empName="John";  
	private int empAge= 30; 

	public String getempName() {
	return empName;
	}
	public int getempAge() {
	return empAge;
	}
	public static void main	(String[]args) {
	Test173EncapsulDemoGetter obj = new Test173EncapsulDemoGetter ();
	obj.getempName(); 
    obj.getempAge();       
	System.out.println("Employee Name: " + obj.getempName());
	System.out.println("Employee Age: " + obj.getempAge());	
	} }

	 
	
	
