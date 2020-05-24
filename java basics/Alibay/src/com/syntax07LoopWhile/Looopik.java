package com.syntax07LoopWhile;

public class Looopik {

	public static void main(String[] args) {
		
		int sum = 0;
		// for loop

		for (int i = 1; i<= 100; i++){
		    sum = sum + i;
		}
		System.out.println(sum);

		// while loop

		sum = 0;
		int j = 1;

		while(j<=100){
		    sum = sum + j;
		    j++;
		}

		System.out.println(sum);

		// do while loop

		sum = 0;
		j = 1;

		do{
		    sum = sum + j;
		    j++;
		}
		while(j<=100);

		System.out.println(sum);
	}

}
