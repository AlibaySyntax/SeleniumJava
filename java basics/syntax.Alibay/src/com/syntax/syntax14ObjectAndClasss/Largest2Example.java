package com.syntax.syntax14ObjectAndClasss;
public class Largest2Example {
public static void main(String[] args) {
	
int[] numbers2= {110,-1,32,61,16,99,74,89,25,100};
int smallest=0;
int largest =0;
int largest2 =0;

for (int i = 0; i < numbers2.length; i++) {
	
	int element = numbers2[i];
	// check if it is bigger than the largest
	if (element > largest) {
	   largest2 =largest;
	largest=element;
	} else if (element > largest2 && element!=largest) { // check if it is bigger than second largest
	   largest2 = element;
	}
	if(element<smallest) {
	   smallest=element;
	}
	}
	System.out.println("Smallest "+smallest);
	System.out.println("Bigest "+largest);
	System.out.println("Second Largest "+largest2);
}
}
