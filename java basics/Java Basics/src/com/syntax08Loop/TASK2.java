package com.syntax08Loop;
import java.util.Scanner;
public class TASK2 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	for(int i=1; i<=10; i++) {
	System.out.println("Do you want to apply for credit card?");
	String creditCard=scan.next();
	if(creditCard.equals("yes")) {
		System.out.println("Congragulations!");
		break;
		
}
	}}}

