package com.syntax05Scanner;

import java.util.Scanner;

public class AlibayCARsSCANNER {

	public static void main(String[] args) {
		/* Capture 2 number from a user
		 * Compare number and identify which is number
		 */
		Scanner input=new Scanner(System.in);
		
		int Toyota=25000;
		int Ford=20000;
		int Lexus=55000;
		   
		  System.out.println("Please choose car (price) number one:");
		  int car1=input.nextInt();
		  
		  System.out.println("Please choose car (price) number Two:");
		  int car2=input.nextInt();
		 
		  System.out.println("Please choose car (price) number Tree:");
		  int car3=input.nextInt();
		  
		  if (car1>car2) {
		    System.out.println(car1 +" Is Expensive than " +car2);}
		      
		  if (car2<car1) {
		    System.out.println(car2+" Is chiped than "+car1);}
		      
		  if (car3>car2) {
		    System.out.println(car2+"  Is chiped than "+car3);}
		    
		  if (car3>car1) {
			System.out.println(car3+" Is cexpensive than "+car1);}
		
		  
		
			
			
		  }}

		
	

	

