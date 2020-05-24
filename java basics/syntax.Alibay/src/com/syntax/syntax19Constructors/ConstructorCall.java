package com.syntax.syntax19Constructors;
public class ConstructorCall {
public ConstructorCall() {
System.out.println("I am non argument Constractor");
}
public ConstructorCall(String str) {
	this();
}
public ConstructorCall(String str, String str1) {
 this(str);//Only use String
 
 //this(12);CE:
 //this("Str","str");CE:
}
public static void main(String[]args) {
//Creating an Oject by passing 2 String value
ConstructorCall obj=new ConstructorCall("Java","Love");
}
}

