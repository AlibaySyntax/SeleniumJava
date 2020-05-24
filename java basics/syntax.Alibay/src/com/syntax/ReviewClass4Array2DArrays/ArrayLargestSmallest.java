package com.syntax.ReviewClass4Array2DArrays;
public class ArrayLargestSmallest {
public static void main(String[] args) {
//Find largest and smallest number in Array		
     int[]numbers= {34,67,3,93,56,72,17,33};
     int largest=numbers[0];
     int smallest=numbers[0];
     int sum=0;
     
     for(int num:numbers) {
     if(num>largest) {
    	 largest=num;
     }
     if(num<smallest) {
    	 smallest=num;
     }
     sum+=num;      //<---- total amount resolve
     }
   System.out.println("The largest number is: "+largest); 	 
   System.out.println("The smallest number is: "+smallest);
   System.out.println("The sum of all number is: "+sum);
}
}
