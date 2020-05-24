package com.syntax26Encapsulation;

import java.util.ArrayList;

public class ArrayListDemo {

public static void main(String[] args) {
//Create an arrayList with names
ArrayList<String>arrayList=new ArrayList<>();
//Adding String Object into arrayList
arrayList.add("John");
arrayList.add("Gulbahar");
//access element from arrayList
String secondElement=arrayList.get(1);
System.out.println(secondElement);

//arrayList is dynamic array
arrayList.add("Jane");
arrayList.add("James");

//how to get number of element inside arrayList?
int size=(arrayList.size());
System.out.println(size);

arrayList.add("Hichn");
System.out.println(arrayList.size());

arrayList.remove("John");
System.out.println(arrayList.size());

arrayList.add("Hichn");
System.out.println(arrayList);

arrayList.set(1,"Ahmed");
System.out.println(arrayList);
//how to retrieve values from arrayList 1 by 17
for(int i=0; i<arrayList.size(); i++);
String element=arrayList.get(1);
System.out.println(element);
System.out.println("--------------");

for(String str:arrayList) {
System.out.println(str);
}}}
