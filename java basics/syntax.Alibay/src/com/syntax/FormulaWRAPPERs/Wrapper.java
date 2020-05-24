package com.syntax.FormulaWRAPPERs;
public class Wrapper {
public static void main(String[] args) {
	
Integer i=new Integer (10); // Boxing
Integer int1=10; //AutoBoxing
System.out.println(i);
System.out.println(int1);

int i1=i.valueOf(i);//Unboxing
int int2=int1;//AutoBoxing
System.out.println(i1);
System.out.println(int2);

}}
