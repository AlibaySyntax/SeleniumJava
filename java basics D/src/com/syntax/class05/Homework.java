package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*
		 * Task-1:Creat a Java program thatwill ask if user has a credit card or not.
		 * if you  user does not have a credit card then offer them. if they do have one
		 * ask what is balance on the card? if balance of the cars is larger than 1000,
		 * tell them to pay off immediately, otherwise you can tell them that they can
		 * spend more
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Do you use credit card");
		boolean answer1 = input.nextBoolean();
		
		if (answer1) {
		System.out.println("what is the current balance on your credit card?");
		double c =input.nextDouble();
		if (c>=1000) {
			System.out.println("Please pay off your dues immediately");
		
		}else {
		
		System.out.println("Please spend more to get higher credit limit");	
		}
		
		} else {
			System.out.println("we have a great credit card offer for you. Are you interested?");
			
		}	
		System.out.println("--------------------------");
}
		
}	

		

	


