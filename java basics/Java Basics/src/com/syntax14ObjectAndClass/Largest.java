package com.syntax14ObjectAndClass;
public class Largest { 
public static void largestCalculation(int[] a) {
	
		int largest = a[0];
		for (int i = 0; i < a.length; i++) {
			
		// check if it is bigger than the largest
			
		if (a[i] > largest || a[i] == largest) {
		largest = a[i];
        }}
		System.out.println(largest);
	    }
        public static void Secondlargest(int[] a) {
	    int largest = a[0];
	    int largest2 = a[1];
	    for (int i = 0; i < a.length; i++) {
		int element = a[i];
		
		// check if it is bigger than the largest
		
		if (element > largest || element == largest) {
		largest = element;
		} else if (element > largest2 && element != largest) { // check if it is bigger than second largest
		largest2 = element;
		}}
		System.out.println(largest2);
	    }
	    public static void smallest(int[] a) {
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
		int element = a[i];
		if (element < smallest){
		smallest = element;	}
		}
		System.out.println(smallest);
	    }
	    public static void main(String[] args) {
		int[] numbers2 = { 1000, 32, 61, 10, 990, 2, 89, 90, 74, 16, 950, 10, 95 };
		System.out.print("largest number of array is: ");
		largestCalculation(numbers2);
		System.out.print("Secondlargest number of array is: ");
		Secondlargest(numbers2);
		System.out.print("Smallest number of array is: ");
		smallest(numbers2);
	}
}



