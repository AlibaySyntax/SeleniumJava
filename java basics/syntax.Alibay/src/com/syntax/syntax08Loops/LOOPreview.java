package com.syntax.syntax08Loops;

import java.util.Scanner;

public class LOOPreview {

	public static void main(String[] args) {
		/*Ask a user to pay for a candy
		 * as long as the entered price is not 2
		 * we need keep ask for paying
		 * One amount is correct -->"Enjoy your candy*/
		Scanner s;
		double price;
		
		s=new Scanner(System.in);
//	do {
//		System.out.println("Please pay for a candy");
//		price=s.nextDouble();
		
//	}while (price!=2);
//	    System.out.println("Enjoy your candy");
		
		System.out.println("Please pay for a candy");
		price=s.nextDouble();
		
		while(price!=2) {
		System.out.println("Please pay for a candy");
		price=s.nextDouble();
     }
		System.out.println("Enjoy your candy");
}}
