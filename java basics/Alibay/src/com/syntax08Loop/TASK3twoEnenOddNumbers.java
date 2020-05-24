package com.syntax08Loop;
import java.util.Scanner;
public class TASK3twoEnenOddNumbers {
public static void main(String[] args) {
		
      Scanner scan=new Scanner(System.in);
      int totalEven=0;
      int totalOdd=0;
      
      System.out.println("Please enter two numbers: ");
      int min =scan.nextInt();
      int max =scan.nextInt();
      
      for(int i=min; i<= max; i++) {
       if(i%2==0) {
          totalEven=totalEven+i;	
       }else {
          totalOdd=totalOdd+i;
        }
        }
 System.out.format("The total of even numbers between: "+min+" to "+max+ " is "+totalEven);
 System.out.println();
 System.out.format("The total of odd numbers between: "+min+" to "+max+ " is "+totalOdd);
}}

