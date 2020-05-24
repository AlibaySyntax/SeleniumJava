package com.syntax.syntax18Constructors;
public class ConstructorTask {
/* CE: saying invalid modifier
 * static Constructor(){
 * 
 * }                     */
public ConstructorTask() {
System.out.println("Public constructor");
}
ConstructorTask(int num){
System.out.println("Default constructor");	
}
protected ConstructorTask(int num, int num1) {
System.out.println("Protected constructor");	
}
private ConstructorTask(String str) {
System.out.println("Private constructor");
}
public static void main(String[]args) {
	ConstructorTask obj=new ConstructorTask();
	ConstructorTask obj1=new ConstructorTask(12);
	ConstructorTask obj2=new ConstructorTask(12,13);
	ConstructorTask obj3=new ConstructorTask("String");
}
}
