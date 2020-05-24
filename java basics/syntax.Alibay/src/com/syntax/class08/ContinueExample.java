package com.syntax.class08;

public class ContinueExample {

	public static void main(String[] args) {
		// write a programm that print numbers from 1 to 20
		// i do not want to print 5,6,7
		
		for(int i=1; i<21; i++) {
			
			if( i==5 || i==6 || i==7) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("____Continue example______");
		
		//write a program that print numbers from 1 to 100
		// i do not want to print 35-55
		
for(int i=1; i<=100; i++) {
			
			if( i>=35 && i<=55) {
				continue;
			}
			System.out.println(i);
		

	}
	}
}
