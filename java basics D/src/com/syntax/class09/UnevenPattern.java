package com.syntax.class09;

public class UnevenPattern {

	public static void main(String[] args) {
		/*
		 **
		 ***
		 ****
		 */
		
		for(int i=1; i<=4; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----printing triangle----");
		/* 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(k+"");
			}
			System.out.println();
		}
		System.out.println("===========");
		//55555
		//4444
		//333
		//22
		//1
		
		
		for(int i=5; i>=1; i--) {
			for(int k=1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println();
		
		}
	}

}
