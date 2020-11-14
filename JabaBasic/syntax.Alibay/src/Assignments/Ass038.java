package Assignments;

import java.util.Scanner;

public class Ass038 {

	public static void main(String[] args) {
		
		/*
		 * For you to do:
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
"Today you will be learning ____"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Is it weekend?");
		
		int day = scan.nextInt();
		System.out.println("Today you will be learning " + day);
		if(day>=1 && day<=5) {
			System.out.println("Manual testing ");
		}else if ( day >=6 && day<=7) {
			System.out.println(" Java ");
		}else {
			System.out.println("Invalid day");
		}
			


	}	

	}


