package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		/*11111
         *22222
         *33333
         *44444
         *55555
         */

		
		System.out.println("===printing pattern=====");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("====printing 5 rows of 1-9=====");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(j);
			}
			System.out.println();
		
		}
System.out.println("====printing 5 rows of 5555 to 1111 =====");
		
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
	}
}
}
