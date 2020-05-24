package com.syntax.syntax25Interfaces;
public interface Drivable {
//compiler by default adds public static final--> MOVE_FAST(Yes)
public static final boolean MOVE_FAST=true;	

//compiler default adds public abstract(Yes)
void drive();//protected is not work
}
abstract class Vehicle {
abstract void stop();
}
//achieving multiple inheritance
class Car extends Vehicle implements Drivable {

Car() {
super();
}
@Override
public void drive() {
System.out.println("Car drives");		
}
@Override
public void stop() {//protected is not work (NO)
System.out.println("Car stops");
		
}
	
}
