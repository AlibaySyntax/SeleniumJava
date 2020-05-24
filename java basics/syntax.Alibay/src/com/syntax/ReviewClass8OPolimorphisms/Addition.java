package com.syntax.ReviewClass8OPolimorphisms;

public class Addition {
	

		public static void add(int a, int b) {
		System.out.println("the sum "+a+b);	
		}
		public static void add(int a,int b, int c) {
		System.out.println("the sum "+(a+b+c));	
		}
		public static void add(int a,double b) {
		System.out.println("the sum "+(a+b));	
		}
		public static void add(double a, int b) {
		System.out.println("the sum "+(a+b));	
		}
		public static void main (String []args) {
			add(4,5);
			add(3,5,8);
			add(3,4,5);
			add(3.2,6);
		}	
}
