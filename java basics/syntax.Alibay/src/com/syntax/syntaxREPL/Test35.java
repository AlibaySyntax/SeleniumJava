package com.syntax.syntaxREPL;
import java.util.Scanner;
public class Test35 {

	public static void main(String[] args) {
		  
		int score=600;
		String loan;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you need loan ?");
	    System.out.println("What your credit score ?");
	    score=scan.nextInt();      
	    loan=scan.nextLine(); 
	    
               if (score<600){
                   System.out.println("Not eligible");
                   
               }else if(score>=600 && score<=700) {
            	   System.out.println("Maybe eligible");
            	  
               }else if(score>=701 && score<=800) {
            	   System.out.println("eligible");
            	   
               }else if(score>=801 && score<=900) {
            	   System.out.println("Difiently eligible");
            	   
           }else {
            	   System.out.println("Unknown");
           }
	
}}
	

