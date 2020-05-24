package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		
		String [][] groceries= {
				{"cucumber","potato","carrot"},
				{"mango","apple","banana","kiwi"},
				{"milk", "cheese", "yogurt"}
		};
		//get single value
		System.out.println(groceries[1][2]);
		
		//get all values from 2D array
		//loop through rows
		for( int r=0; r<groceries.length; r++) {
			//loop through columns
			for (int c=0; c<groceries[0].length; c++) {
				System.out.println(groceries[r][c]);
			}
			System.out.println();
		}
		System.out.println("-- getting elements using advanced for loop-- ");
		//loops through all arrays
		for(String[] array:groceries) {
			//loop through each single array
			for(String items:array) {
				System.out.println(items + " ");
			}
			System.out.println();
			
		}

	}

}