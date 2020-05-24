package com.syntax.class05Scanner;
import java.util.Scanner;
public class onlineTASK1 {

	public static void main(String[] args) {
/*Prompt the user to enter person heights in inches.
* person short classified as one of the following: short(under 60 inch)
* medium -72 inch) tall(over 72 inch). Write a program that will print
* weekend or weekday. If any day from 1-5 -> output "It is a week
* from 6-7 -> output "It is a weekend, an other day -. output */
             
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your height in inches");
	    int height =scan.nextInt();
              
         if (height>0 && height<=60) {
        	System.out.println("You are short");
         }else if (height>=61 && height<=72) {
        	 System.out.println("You are medium"); 
         }else if (height>72) {
        	 System.out.println("You are tall");
         }else {
        	 System.out.println("Invalid height");
              }
	}

}
