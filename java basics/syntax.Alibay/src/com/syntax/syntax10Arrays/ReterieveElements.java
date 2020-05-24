package com.syntax.syntax10Arrays;
public class ReterieveElements {
public static void main(String[] args) {
	
		char [] grades= {'A','B','C','D','E','E'};
		//getting all elements
		for(int i=0; i<grades.length;i++){
			System.out.print(grades[i]);
		}
		System.out.println();
	System.out.println("--printing using advanced for loop--");
		for(char grade:grades) {
			System.out.print(grade+"");
		}
		// create an array of fruits and retrieve all elements
		String []fruits= {"Banana","Kiwi","Orange","Pear","Appl","Mango"};
		//if fruit is apple -->that is your favorite fruit
		//advanced for loop, enhanced for loop, for each loop
		for(String fruit:fruits) {
			if(fruit.equals("Apple")) {
			System.out.println(fruit+"is your favorite fruite");
		}
		System.out.println("-------------------");
		//regular for loop
		//fruits.length=number of element
		for(int i=0; i<fruits.length; i++) {
		System.out.println(fruits[i]);
}}}}
