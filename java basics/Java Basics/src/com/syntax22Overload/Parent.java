package com.syntax22Overload;
public class Parent {
	
Parent(){
System.out.println("Parent constructor ");
}

private void hello() {
System.out.println("Hello from parent class");	
}

static void bye() {
System.out.println("Bye from parent class");
}
}
class Child extends Parent{
//We are not
Child(){
System.out.println("Bye from Child");
}
private void hello() {
System.out.println("Hello from child class");
}}
