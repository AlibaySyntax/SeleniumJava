package Assignments;

import java.util.Scanner;

public class Ass035 {

	public static void main(String[] args) {
		
		/*
		 * For you to do:
Create a program that prompt user with question:  "Do you need a loan?"
If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
Based on the score define users eligibility:
if score is below  600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

Output: 
"The eligibility is ____"
		 */
	
		Scanner userInput=new Scanner(System.in);
		System.out.println("Do you need a loan");
		String answer = userInput.nextLine();
		if (answer.equalsIgnoreCase("Yes"));
		System.out.println("What is your credit score?");
		
		int score =userInput.nextInt();
		boolean num =true;
		if(num){
		  System.out.println("The eligibility is " );
		}
		if (score<600) {
			System.out.println("Not eligible");
		
		}else if (score>600 && score<=700) {
			System.out.println("Maybe eligible");
			
		}else if (score>701 && score<=800) {
			System.out.println("Eligible");
		}else if (score>801) {
			System.out.println("Definitely eligible"); 

} else {
	System.out.println(" Unknown");
}
}
}