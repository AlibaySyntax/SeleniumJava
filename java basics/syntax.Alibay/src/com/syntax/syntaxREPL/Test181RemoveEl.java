package com.syntax.syntaxREPL;
import java.util.ArrayList;
public class Test181RemoveEl {
	
public static void main(String[] args) {
	                                                   
ArrayList <String>arrayList=new ArrayList<>(); // <----Create an arrayList with names
arrayList.remove("hi ");                       //<---- Adding String Object into arrayList
arrayList.add("yo ");
	
arrayList.remove("sup ");
arrayList.add("yolo ");
arrayList.remove("boop ");

for(String str:arrayList) {
System.out.print(str);

}}}

