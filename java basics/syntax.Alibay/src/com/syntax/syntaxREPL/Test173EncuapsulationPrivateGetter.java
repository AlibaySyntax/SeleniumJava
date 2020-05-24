package com.syntax.syntaxREPL;

import java.awt.List;

public class Test173EncuapsulationPrivateGetter {
	
	    // private variables declared  
	    // these can only be accessed by  
	    // public methods of class 
	    private String getName="John"; 
	    private  int getAge=30; 

	    private String getName() {
		return getName ;
	    }
	    private int getAge() {
	    return getAge;	
	    }
	    public class TestEncapsulation {
	    }
	    public static void main (String[] args)  { 
	    Test173EncuapsulationPrivateGetter obj = new Test173EncuapsulationPrivateGetter();
	        	
	            obj.getName(); 
	            obj.getAge(); 
	           
	            System.out.println("Employee Name: " + obj.getName()); 
	            System.out.println("Employee Age: " + obj.getAge()); 
	            }}
