package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create an array on integers
		 * and calculate the sum of all 
		 * integers elements in an array
		 */
		int []numbers = { 27, 43, 87, 322, 6, 32, 65, 85, 54,7};
		int sum = 0;
		for(int i:numbers) {
			sum = sum +i;
			
		}
		System.out.println("The sum of the numbers in this array is :" + sum);
		
		
		System.out.println("=====using another loop=====");
		int sum1=0;
		for(int i=0; i<numbers.length; i++) {
			sum1+= numbers[i];
			
		}
		System.out.println("The sum of the numbers in this array is :" + sum1);


	}

}
