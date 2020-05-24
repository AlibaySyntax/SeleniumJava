package com.syntax11Array;
public class RECAAPand2D {
public static void main(String[] args) {
	      
	String [][] groceries= {
			{"cucumber, ","potato, ","carrot,"},
			{"mango, ","apple, ","banana, ","kiwi,"},
			{"milk, ","cheese, ","yougurt,"}
	        };  
	        System.out.println(groceries[1][2]);
	        
	        System.out.println("&&&&&&&&&&&");
	        
	        // get all values from 2D array
	        for (int r=0; r<groceries.length; r++) {
	        	for (int c=0; c<groceries[r].length; c++) {
	        System.out.print(groceries[r][c]+"");
	        }
	        System.out.println();
            }
	        
	        System.out.println("---Getting elements using advanced for LOOP --");
	        System.out.println();
	            //loop through all arrays
	            for(String[]array:groceries) {
	        	//loop through each single array
	        	for(String items:array) {
	        		
	        	System.out.print(items+"");
	        	}
	        	System.out.println();
	        	
}}}
