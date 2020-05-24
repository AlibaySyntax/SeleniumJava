package com.syntax07LoopWhile;
import java.util.Scanner;
public class HW {
public static void main(String[] args) {
		Scanner scan;
		char operator;
		double num;
		double num1;
		double result=0.0;
				;
scan=new Scanner(System.in);
System.out.println("==calculator==");
System.out.println("Please enter two number & an Arithmetic operators");	
System.out.println("=================================================");	
System.out.println("Number 1 :");	
num=scan.nextInt();
System.out.println("Choose from(+,-,* or /): ");		
operator=scan.next().charAt(0);
System.out.println("Number 2 :");
num1=scan.nextInt();
scan.close();
switch(operator) {
case'+':
	result=num+num1;
	break;
case'-':
	result=num-num1;
	break;
case'*':
	result=num*num1;
	break;
case'/':
	result=num/num1;
	break;
default:
	System.out.println("You have entered wrong operator");
	return;
}
// if result was not calculated i do not want to see below message
if (result !=0.0) {
    System.out.println("You calculation is " + result);

}}}
