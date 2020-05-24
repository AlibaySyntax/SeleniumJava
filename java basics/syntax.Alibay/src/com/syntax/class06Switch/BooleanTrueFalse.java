package com.syntax.class06Switch;

public class BooleanTrueFalse {

	public static void main(String[] args) {
		
		boolean Allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=true;
		
		
		          if (Allergy) {
		             System.out.println("Please answer below");
		             
		          if (appleAllergy)  {    
		        	 System.out.println("You can eat Apple");
		          }else {
		        	  System.out.println("Do not eat Apple");
		          if (orangeAllergy){  
		        	  System.out.println("You can eat Orange");
		          }else {
		        	  System.out.println("Do not eat Orange");}
		          if (kiwiAllergy) {
		        	  System.out.println("You can eat Kiwi");
		          }else {
		        	  System.out.println("Do not eat Kiwi");}}
		          
		      }else  {
		      System.out.println("You are healthy");}

	}

}
