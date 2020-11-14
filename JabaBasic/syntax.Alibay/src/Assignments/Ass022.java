package Assignments;

import java.util.Scanner;

public class Ass022 {

	public static void main(String[] args) {
		
		 /*For you to do:
Write a program to take user name, age and mobile number

First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"

Example Output: 
Enter your name
Enter your mobile number
Enter your age
Your name is Weqas, your age is 45 and your mobile number is 571-339-9999


		  * 
		  */
		
        Scanner name = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String text = name.nextLine();
		
		System.out.println("Enter your mobile number");
		int num = name.nextInt();
	
		System.out.println("Enter your age");
		int age =name.nextInt();
		
		System.out.println("Your name is " + text + "," + "your age is " 
		+ age + " and your mobile number is " + num);
			
	}

}
