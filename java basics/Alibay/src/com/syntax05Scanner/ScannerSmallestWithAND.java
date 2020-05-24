package com.syntax05Scanner;
import java.util.Scanner;

public class ScannerSmallestWithAND {

	public static void main(String[] args) {
		
		          Scanner scan=new Scanner(System.in);
		          
		            System.out.println("Please enter first number");
		            double num1;
		            num1=scan.nextDouble();
		              
		            System.out.println("Please enter second number");
		            double num2;
		            num2=scan.nextDouble();
		            
		            System.out.println("Please enter third number");
		            double num3;
		            num3=scan.nextDouble();
		            
		            double smallest=0;
		            
		            if (num1<num2 && num1<num3) {
		            	smallest=num1;
		            }else if(num2<num1 && num2<num3) {
		            	smallest=num2;
		            }else if(num3<num1 && num3<num2) {
		            	smallest=num3;
		            }
		            System.out.println("Smaller number is: "+smallest);
		            
	}

}

