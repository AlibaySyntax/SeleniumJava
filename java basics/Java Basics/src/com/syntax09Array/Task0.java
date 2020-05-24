package com.syntax09Array;

public class Task0 {
/*Print the following pattern:
 *55555
 *4444
 *333
 *22
 *1          */
	public static void main(String[] args) {  
	   //print triangle of numbers
	        for (int r=1; r<=5; r++){
			for (int c=1; c<=2; c++){
				System.out.print("*"+"");
			}
			    System.out.println();
		    }   
		        for (int r=5; r>=1; r--){
				for (int c=1; c<=r; c++){
					System.out.print("*"+"");
				}
				    System.out.println();
			    }
}}


	


