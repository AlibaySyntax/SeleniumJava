package com.syntax26Encapsulation;

import java.util.ArrayList;

public class ArrayListIntro {

public static void main(String[] args) {
//Create an arrayList to store numbers
	
ArrayList<Integer>numbers=new ArrayList <Integer>();
numbers.add(4);
numbers.add(62);
numbers.add(8);
numbers.add(5);
numbers.add(4);
//System.out.print(numbers.get(0));
//System.out.println("------------");
for (int i=0; i<numbers.size();i++) {
int num=numbers.get(4);//autounboxing

//System.out.println("------------");
}
for(int num:numbers) {
System.out.print(num+" " );
}

}}


