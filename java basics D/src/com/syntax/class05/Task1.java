package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * ask use they heights
		 * if under 60 " -->short
		 * if 61-72" ---> med
		 * if 72" + --> tall
		 * write a program that will print weekend or weekday
		 * 1-5 day-->it is a weekday
		 * 6-7 --> it's weekend
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		
		int height = scan.nextInt();
		
		if(height>=0 && height<=60) {
			System.out.println("You are short");
		}else if (height>61 && height <=72) {
			System.out.println("You are medium");
		}else if (height>72) {
			System.out.println("You are tall");
		}else {
			System.out.println("invalid height");
		}

	}

}
