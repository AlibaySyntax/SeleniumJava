package com.syntax.class05Scanner;
import java.util.Scanner;
public class ScannerAndVerification {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter first umber");
		int num1=input.nextInt();
		
		System.out.println("Please enter second umber");
		int num2=input.nextInt();
		
		//System.out.println(num1)
		//System.out.println(num2)
		
		if (num1>num2) {
			System.out.println(num1+"is larger than"+num2);
			
		}else {System.out.println(num2+ " is larger than "+num1);
		
			
		}
		
		
	}
}

