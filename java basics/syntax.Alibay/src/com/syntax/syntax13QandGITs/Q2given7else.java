package com.syntax.syntax13QandGITs;
public class Q2given7else {
public static void main(String[] args) {
//Write a java program to check whether a given number is prime or not?
//Prime number is a number that is greater that 1
//Prime number should meet 2 condition(division by 1 and itself only)	
//2(1,2) ,3 (1,2,3), 5 (1,2,3,4,5) 7 (2,3,4,5,6,7), 11,13,17
	
int given=7;
boolean isPrime=true;

if(given>1) {
for(int i=2; i<given; i++) {
if (given%i==0) {
	isPrime=false;

}
}
}else {
	isPrime=false;
}
System.out.println("Given number "+given+" is prime? "+isPrime);
}

}
