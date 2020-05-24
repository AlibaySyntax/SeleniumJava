package com.syntax.syntaxReview04;

public class TwoDArrayDema {

	public static void main(String[] args) {
		//1st way of creating 2d-array
		int[] [] numbers = new int[2] [3];
		//enter into array, 
		//into row index 0 and column index 2 
		numbers[0] [2] = 8;
		numbers[0] [0] = 5;
		numbers[1] [0] = 9;
		numbers[1] [1] = 6;
		numbers[1] [1] = 2;
		numbers[1] [2] = 3;
		
		//second way of creatind 2D-array
		
		int[][] numbers2 = { {5,6,8}, {9,2,3} };
	
		System.out.println("Lets get some values from numbers2");
		
		int value = numbers2 [1][0];
		System.out.println(value);
				
		// get and print in one step
		System.out.println(numbers2 [1][1]);
		
		//1d-array is married to for loop
		//2d-array is married to nested for loop
		
		// how many rows?
		int rows = numbers2.length;
		//how many columns in first row?
		int columns= numbers2[0].length;
		for(int row =0; row<numbers2.length; row++) {
			System.out.println("I am in the" + row + "row");
			for(int cols = 0; cols<numbers2[row].length; cols++) {
			System.out.println("Iam in column " + cols);
			System.out.println("the value is " + numbers2[row][cols]);
			}
			System.out.println();
		}
		
		
				
				
				

	}

}
