package com.syntax.ReviewClass8Abstractions;

public abstract class Orange extends Fruit implements Peelable{
	
public Orange(String color) {
		super(color);
		
	}
abstract public void Orange1(String color);
String color;
public void Orange(String color) {
//this.color();
}
public void eat() {
System.out.println("Eatting the Orange");
}
public void pee() {
System.out.println("I eat Pee");
}

}