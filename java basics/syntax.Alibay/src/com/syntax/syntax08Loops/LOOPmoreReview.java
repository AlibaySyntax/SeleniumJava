package com.syntax.syntax08Loops;

public class LOOPmoreReview {

	public static void main(String[] args) {
	    //To print number from 50 to 1
		for(int i=50; i>=1; i--) {
		System.out.println(i);
		}
		System.out.println("-------PRINTING ODD NUMBERS----");
	    //Print odd numbers between 20 and 50
		for(int i=20; i<=50; i++) {
		if (i%2!=0) {
		System.out.println(i);	
		}
		}
		System.out.println("=======PRINTING ODD NUMBERS======");
		
			for(int i=21; i<=50; i+=2) {
			if (i%2!=0) {
			System.out.println(i);
		}
		// What is the output
		System.out.println("----------TOTAL-------------");	
		int total=2;
		
		for (int k=1; k<4; k++) {
			total=total*k;
		}
		System.out.println("Final "+total);
			
			
		
}}}
