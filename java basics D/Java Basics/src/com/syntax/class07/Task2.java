package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		// how to print odds number from 1 to 20
		
		//first way
		
		int num = 7;
		while (num<=98) {
			System.out.println(num);
			num+=7;
		}
		System.out.println("==================");
		//second way using mod and if condition
		
		int num2 =1;
		while(num2<=20) {
			if (num2%2!=0) {
				System.out.println(num2);
			}
			num2++;
		}
		System.out.println("=================");
		//third way
		int num3 =1;
		while(num3<=20) {
			System.out.println(num3++);
			num3++;
			
			
		}

	}

}
