package com.syntax.syntax27Collection;
import java.util.ArrayList;
public class ArrayListDemo {
public static void main(String[] args) {

ArrayList<Integer> arrlist = new ArrayList<Integer>(5);// <----create an empty array list with an initial capacity  
   
arrlist.add(10); // <---- use add() method to add elements in the list  
arrlist.add(22); 
arrlist.add(30); 
arrlist.add(40); 

arrlist.add(3, 35);// <--- adding element 35 at fourth position 

for (Integer number : arrlist) { // <---- let us print all the elements available in list
System.out.println("Number = " + number); 
} 
}}


