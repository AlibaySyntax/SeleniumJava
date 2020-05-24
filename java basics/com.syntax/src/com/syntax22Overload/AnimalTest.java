package com.syntax22Overload;

public class AnimalTest {
public static void main(String[]args) {
//Non primitive csting: upcasting
	
Animal obj=new Tiger();
obj.sleep();
obj.eat();
//obj.run();


System.out.println("-------Accesing methods using Par class");
Animal animal=new Animal();
animal.eat();
animal.sleep();

System.out.println("-------Accesing methods using Child class");
Tiger tiger=new Tiger();
tiger.eat();
tiger.sleep();
tiger.run();
}
}
