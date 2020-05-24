package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
	
		//task-2
		/*
		 * write a program to ask user to enter numbers of worked years and annual
		 * slary.If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not.Once user is eligible and slasry is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("how long you are working with the company?");
		int year = userInput.nextInt();
		
		if (year>=5) {	
		System.out.println("what is your Annual Salary?");
		
		double salary = userInput.nextDouble();
		System.out.println("You are eligible for Bonus!!");
		
			if (salary>=50000) {
				System.out.println("your bonus amount is 5000");
			}else {
				System.out.println("your bonus amount is 3000");
				
			}
			
		}else {
			System.out.println("sorry you are not eligable for bonus");
			
		}

	}

}
