package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		
		int evenSum=0;
		int oddSum=0;
		
		for(int i=1; i<=99; i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
			}else {
				oddSum=oddSum+1;
			}
		}
		System.out.println("Sum of evens =" + evenSum);
		System.out.println("Sum of odds =" + oddSum);

	}

}
