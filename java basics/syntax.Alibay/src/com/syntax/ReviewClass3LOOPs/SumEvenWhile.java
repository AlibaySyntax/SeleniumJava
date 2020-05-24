package com.syntax.ReviewClass3LOOPs;
public class SumEvenWhile {
public static void main(String[] args) {	
	//Add Even number
	//Also add Odd number
	//Between 1 && 50
	//you have 4 minutes
	//you can use while or do while
	//you can use mod operator or if-else
	int count=1;
	int totalOdd=0; int totalEven = 0;
	//1st way
	while(count<=50) {
		if(count%2==0) {
			totalEven += count;
		}else {
			totalOdd+=count;
		}
	count++;
		}
	System.out.println("totalEven is = "+totalEven);
	System.out.println("totalOdd is = "+totalOdd);
	
	System.out.println("-----------using do-while---------");
	
	//2nd way. This adds only odd
	count=1;
	totalOdd=0;
	do {
	 totalOdd+=count;
	 count+=2;
	}
	while(count<=50);
	System.out.println("totalOdd is = "+totalOdd);
}}
