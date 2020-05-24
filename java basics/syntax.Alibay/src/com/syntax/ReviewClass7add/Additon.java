package com.syntax.ReviewClass7add;

public class Additon {
//Overloading method
public static void add(int a,int b) {
System.out.println("The sum is " +(a+b));	
}
public static void add(int a,int b,int c) {
System.out.println("The sum is " +(a+b+c));	
}
public static void add(int a,double b) {
System.out.println("The sum is " +(a+b));	
}
public static void add(double a,int b) {
System.out.println("The sum is " +(a+b));	
}
public static void main(String[] args) {
add(4,5);
add(3,5,8);
add(3,4,5);
add(6,5);
	}

}
