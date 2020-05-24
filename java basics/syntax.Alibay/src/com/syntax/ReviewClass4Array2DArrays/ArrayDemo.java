package com.syntax.ReviewClass4Array2DArrays;
public class ArrayDemo {
public static void main(String[] args) {
	     //silly way
		int a1=5;
		int a2=7;
		int a3=8;
		int a4=9;
		int a5=20;
		//System.out.println(a1);
		//System.out.println(a2);
		//System.out.println(a3);
		//System.out.println(a4);
		//System.out.println(a5);
		
		 //1st professional way
		 //declaring an array, all elements have the default value
		int[] numbers=new int[5];
		//initializing values for array elements
		numbers[0]=9;
		numbers[1]=8;
		numbers[2]=7;
		numbers[3]=5;
		numbers[4]=20;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		//pricing the element with index2, third element
		System.out.println("printing using index with variable");
		int i=0;
		System.out.println(numbers[i]);
		i++;
		System.out.println(numbers[i]);
		i++;
		System.out.println(numbers[i]);
		i++;
		System.out.println(numbers[i]);
		i++;
		System.out.println(numbers[i]);
		//method "a" using for LOOP
		//this method can  iterates the whole array
		System.out.println("using for LOOP");
		for(int j=0; j<=4; j++) {
		System.out.println(numbers[j]);
		}
		int arrayLength=numbers.length;
		System.out.println("The length of the array is: "+arrayLength);
		System.out.println("Reading from array using for Length/loop");
		for(i=0; i<arrayLength; i++)
		System.out.println(numbers[i]);
		//method "b" using for/each loop/advanced for loop/enhanced for LOOP
		//this method iterates the whole array
System.out.println("Array using for-each loop/advanced for loop/enhanced for loop");
		for (int number: numbers) {
		System.out.println(number);
        }
		//2nd professional way of initializing array
		System.out.println("Second way using curly brackets");
		int[] numbers2= {4,6,8,9,15,16};
		System.out.println("length is: "+numbers2.length);
		
		System.out.println("For LOOP");
		for(int j=0; j<numbers2.length; j++) {
		System.out.println(numbers2[j]);
		}
		System.out.println("Enhanced For LOOP");
		for(int number:numbers2) {
		System.out.println(number);
		}
		}}


