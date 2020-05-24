package com.syntax.class03DTypesINT;

public class IfCondition {

	public static void main(String[] args) {
		// Declarea number and compare if number is larger than 100
		//if number is larger than 100-->my number is large
		
		
	       System.out.println("starting coding");
		
		int num=178;
		if(num>1000) {
			System.out.println("My number is large");
		}
            
		    System.out.println("end of the programm");
            
		    System.out.println("--------------------");
		    
		    int expectedHours =15;
		    int actualHours=15;
		    //if actual is more than expected -->you will love Java
		    
		    if(actualHours>=expectedHours) { //if true go inside if block
		    System.out.println("You will love Java");
		    }else {//otherwise (if False)__> go inside else block
		    	System.out.println("You will not like Java");
		    	
		    }
            
		    System.out.println("--------------------");
		    
		    double budget=10000;
		    double carPrice=12000;
		    
		    if(budget>=carPrice) {
		    	System.out.println("I will by my car");	
		    	System.out.println("I willbe happy");
		    }else {
		    	System.out.println("I will not buy car" + "I will go learn Java");
		    	System.out.println("I will be motivated");
		    }
		    
		    System.out.println("I am code after if condition");
	}

}
