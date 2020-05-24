package com.syntax.class05Scanner;

import java.util.Scanner;

public class ScannerLogicalOperator {

	public static void main(String[] args) {
		/*take age input from a user and then based on the age print output
		 *if age from 0-3--> you are babu
		 *if age 4-5 --> you are a kid
		 *if age 6-12-->you are child
		 *if age from 13-19 --> you are teenager
		 *if age from 20-64 --> you are an adult
		 *if age is more or equal to 65--> you are a senior 
		 */
		
		//1 step-let's declare all variables
		
		//to import we command + shift+o
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age = scan.nextInt();
		
		if(age>0 && age<=3) {
			System.out.println("You are a baby");
		}else if(age>3 && age<=5) {
			System.out.println("You are kid");
		}else if (age>6 && age<=12) {
			System.out.println("You rae a child");
		}else if (age>13 && age<=19) {
			System.out.println("You are a teen");
		}else if (age >20 && age<=64) {
			System.out.println("You are adult");
		}else if (age>65) {
			System.out.println("You are a senior");
		}else {
			System.out.println("Enjoy your life");
		}

	}

}
