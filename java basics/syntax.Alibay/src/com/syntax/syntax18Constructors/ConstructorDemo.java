package com.syntax.syntax18Constructors;
public class ConstructorDemo {
	
static String str="Hello";
ConstructorDemo(){
System.out.println("I am your constructor");
System.out.println("am argument constructor");
}
public ConstructorDemo(String str) {
System.out.println("I am constructor with 1 String parameter= "+str);

}
protected ConstructorDemo( int num) {
System.out.println("I am constructor with 1 intiger value= "+num);
}
private ConstructorDemo(String str, int num) {
System.out.println("I aam constructor with 1 intiger value= " +str+ "& " +num);
}
void ConstructorDemo() {
System.out.println("I do not Know who am i");
}
public static void main(String[]args) {
	
System.out.println(str);
ConstructorDemo obj=new ConstructorDemo ("Yes ",13);
ConstructorDemo obj1=new ConstructorDemo();
obj1.ConstructorDemo();
}}
