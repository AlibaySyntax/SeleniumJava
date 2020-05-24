package com.syntax27Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListAndIterator {
public static void main(String[] args) {
	
//let store choloade
ArrayList<String>choco=new ArrayList<>();
choco.add("Kinder");
choco.add("godiva");
choco.add("ki kat");
choco.add("snickers");

//create arraylist of sweets
ArrayList<String>sweet=new ArrayList<>();
sweet.add("ice cream");
sweet.add("cheese cake");
sweet.addAll(choco);
System.out.println(sweet.size());
System.out.println(sweet);

//we want to iterate through the collection
Iterator <String> it= sweet.iterator();
//iterator in 1 direction
while(it.hasNext()) {
String element=it.next ();
//System.out.println(element);
if(element.equals("ice cream")) {
it.remove();
}
}
System.out.println("Arraylist after removing element");
System.out.println(sweet);
//I want to get elements backwards
for(int i=sweet.size()-1; i>=0; i++) {
System.out.println(sweet.get(i)+";");
}
//advensed for loop
//iterator/lops in 1 direction
for(String str:sweet) {
System.out.println(str);
}
}}
