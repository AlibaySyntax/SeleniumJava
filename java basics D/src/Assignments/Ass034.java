package Assignments;

import java.util.Scanner;

public class Ass034 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to find the largest number among three distinct numbers using nested if condition
Please use Scanner class to take input from users

Expected Output:
Please enter 3 distinct numbers
The largest number is 14
		 */
Scanner variable = new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		String text = variable.nextLine();
		
		
		System.out.println("Please enter 3 distinct numbers");
		String text1= variable.next();
		
		System.out.println("Please enter 3 distinct numbers");
		String text2= variable.next();
		
		
	
		
		int num =14;
		
		if(num==14) {
			
			System.out.println("The largest number is 14");
			
			
		}
		System.out.println("---------------------");
		
		Scanner input= new Scanner(System.in);
	       System.out.println("Please enter 3 distinct numbers");
	       
	        int num1=input.nextInt();
	        int num2=input.nextInt();
	        int num3=input.nextInt();
	        int Largest;
	      
	            if (num1>num2) {
	            if (num1>num3) {
	               Largest=num1; 
	            }else {	
	               Largest=num3; 
	            }
	            }else {
	            if(num2>num3) {
	               Largest=num2;
	            }else {
	               Largest=num3;       
}}  
	            System.out.println("The Largest number is " +Largest);
	            


	}

}
