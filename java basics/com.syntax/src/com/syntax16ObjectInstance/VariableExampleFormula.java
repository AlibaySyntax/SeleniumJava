package com.syntax16ObjectInstance;
public class VariableExampleFormula {


public String myVar="instance variable";// instance variable 

public void myMethod(){// local variable
	
String myVar = "Inside Method";
System.out.println(myVar);
}   
public static void main( String args []) {           
VariableExampleFormula obj = new VariableExampleFormula();// Creating object
/* We are calling the method, that changes the  value of myVar. 
 * We are displaying myVar again after the method call, to demonstrate that the local  
 * variable scope is limited to the  method itself.       */      
System.out.println("Calling Method");      
obj.myMethod();      
System.out.println(obj.myVar); 

}}	


