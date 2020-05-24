package com.syntax.ReviewClass4Array2DArrays;
public class TwoDArrayDemo {
public static void main(String[] args) {
	//1st way of creating 2D-array
	int [][]numbers=new int[2][3];
	
	//enter into array. into row index 0 and column index 2
	numbers[0][2]=8;
	numbers[0][0]=5;
	numbers[1][0]=9;
	numbers[0][1]=6;
	numbers[1][1]=2;
	numbers[1][2]=3;
	//2 way of creating 2D-array
	int [][] numbers2= {{5,6,8},{9,2,3}};
	
	System.out.println("Let's get some values from numbers 2");
	
	//1 get it,the print it
	int value=numbers2[1][0];
	//System.out.println("It should be 9. It is? " +value);
	System.out.println(value);
	
	//get and print in one step
	System.out.println(numbers2[1][1]);
	
	//1D-array is married to for loop
	//1D-array is married to nested for loop
	
	//now many raws?
	int rows=numbers2.length;
	//how many columns in first row?
	int columns=numbers2[0].length;
	
	for(int row=0; row<numbers2.length; row++) {
		System.out.println("I am in the " +row+ " row");
		for(int cols=0; cols<numbers2[row].length; cols++) {
		System.out.print("I am in column " +cols);
		System.out.println(" The value is "+numbers[row][cols]);
		
	}
		
}}}
