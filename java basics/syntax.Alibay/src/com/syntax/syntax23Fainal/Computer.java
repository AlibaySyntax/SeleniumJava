package com.syntax.syntax23Fainal;
class SmartMachine{
	
public void smart() {
System.out.println("I am smart machine");	
}
}
public class Computer extends SmartMachine {
	
	String brand;

	public Computer (String make) {
	this.brand=brand;
	}

	public void run() {
	System.out.println(brand+ "Canrun the System. ");
	}

	public void save() {
	System.out.println(brand+ " Can save input.");	
	}
	public void transfer() {
	System.out.println(brand+ " Can transver information.");
	}
	public void storage() {
	System.out.println(brand+ " Can stor input.");
	
	}
    }
	class Apple extends Computer {
	public Apple(String brand) {
	super(brand);
	}
	public void run() {
	System.out.println(brand+ " can run system faster.");
	}
	public void save() {
	System.out.println(brand+ " saves input in different way.");
	}
	public void transfer() {
	super.transfer();
	}
	public void safe() {
	System.out.println(brand+ " is safer.");
	}	
	}
	class HP extends Computer {
	public HP (String brand) {
	super (brand);
	}
	public void run() {
	super.run();
	transfer();
	System.out.println(brand+ " Fu, Fu, Fu.");
	}
	}
	class MS extends Computer {
	public MS (String brand) {
	super(brand);
	}
	public void run() {
	transfer();
	System.out.println(brand + " Is good, but Apple is better.");
	}
	}
