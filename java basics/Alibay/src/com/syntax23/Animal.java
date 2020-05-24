package com.syntax23;
public class Animal {

public static void whoAmI() {
System.out.println("I am an animal");
}
public void sleep() {
System.out.println("Animals sleep");	
}
//public void eat() {
//System.out.println("Animals aet");
}
//}
class Bird extends Animal{
//@Override	
public static void whoAmI() {
System.out.println("I am a bird");
	
}
public void sleep() {
System.out.println("Bird sleep");	
}
public void eat() {//If is not before CLASS, this will not working
System.out.println("Animals aet");
}
}
