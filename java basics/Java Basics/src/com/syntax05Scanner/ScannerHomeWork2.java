package com.syntax05Scanner;
import java.util.Scanner;
public class ScannerHomeWork2 {

	public static void main(String[] args) {
		 // Task
		 /*write program to ask user to enter number of worked years and annual
		 *salary. If user worked for more or equals to 5 years that user is eligible
		 *for the bonus , otherwise he is not. Once user is eligible and salary is 
		 *larger than 50000 than bonus = 5000,otherwise bonus 3000.*/
		Scanner userInput=new Scanner(System.in);
		System.out.println("How long you worked with the company");
		int year=userInput.nextInt();
		System.out.println("What is your annual salary?");
		double salary=userInput.nextDouble();
	    if(year>=5) {
	    	System.out.println("You are eligible for Bonus !!");
	    	if(salary>=50000) {
	    		System.out.println("Your bonus amount is 5000. ");
	    	}else {
	    		System.out.println("Your bonus amount is 3000. ");
	    }
	    }else {
		        System.out.println("Sorry, you are not eligible");
	    }
		userInput.close();
}}


