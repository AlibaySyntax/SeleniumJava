package com.syntax.class05;

public class LogicalAndOr {

	public static void main(String[] args) {
		
int num = 178;
		
		if (num>=1 && num<=10) {
			System.out.println("This is small number");
		
		}else if (num>10 && num<=100) {
			System.out.println("This is big number");
			
		}else if (num>100 && num<=1000) {
			System.out.println("This is lalge number");
		}else {
			System.out.println("Number is super large");
		}

	}

}
