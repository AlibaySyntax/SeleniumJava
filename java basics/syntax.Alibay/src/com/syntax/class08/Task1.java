package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*1.
		 * print numbers from 1 to 50
		 * except those that are divisible by 3
		 * 2.
		 * creat a programm that will be asking user to apply
		 * for credit card 10 times.
		 * as soon as you get "yes" from a user
		 * program should stop asking
		 */
		
for(int i=1; i<51; i++) {
			
			if( i%3==0) {
				continue;
			}
			System.out.println(i);	

	}
            System.out.println("===second task");
            
            Scanner scan = new Scanner(System.in);
            for(int i = 1; i<= 10; i++) {
            	System.out.println("Do you want to apply for credit card?");
            	String creditCard = scan.next();
            	if(creditCard.equals("yes")) {
            		System.out.println("Congratulations!");
            	break;
            	}
            	
            }

}
}