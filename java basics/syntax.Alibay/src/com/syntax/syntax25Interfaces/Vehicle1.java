package com.syntax.syntax25Interfaces;
import java.util.*;
public interface Vehicle1 {
	

	String color;
	(String Vehicle){
	this.color=color;
	int Vehicle;
	Vehicle++;
	
	System.out.println("We build "+ Vehicle);
	}
	public static void Total() {	
	}
	//public void drive {
	//System.out.println("Manualy drive");
	//}
	public void stop() {
	//System.out.println("vehicle stops");
	}
	public void belt() {
	//System.out.println(" have belt");
	}
	//abstract void drive();
	abstract void start();
	abstract void brake();
    //========================================//
	}
	abstract class Bus implements Vehicle1 {
	String carType;
	Bus (String color, String carType, String bumper) {
	super();
	this.carType=carType;
	}
	public void start() {
	
		
	}
	//@Override
	public void drive() {
	System.out.println("Can drive only manualy");	
	}
	@Override
	public void brake() {
	System.out.println(carType+ " have brake");
	}
	@Override
	public void belt() {
	System.out.println(carType+" have belt");
	}
	//=========================================//
	}
	abstract class Tesla extends Bus{
	String make;
	Tesla(String color, String carType, String make){
	super(color,carType,color);
	this.make=make;
	}
	@Override
	public void start() {
	System.out.println(make+" starts remotly");
	}
	//@Override
	public void drive () {
	System.out.println(make+" drive on autopilot");
	}
	@Override
	public void belt() {
	System.out.println(make+" have belt");
	}
	//=========================================//
	}
	abstract class Toyota extends Bus{
	String make;
	Toyota (String color,String carType, String make){
	super(color,carType, make);
	this.make=make;
	}
	@Override
	public void start() {
	System.out.println(make+ " Starts with key");	
	}
	@Override
	public void brake() {
	System.out.println(make+ " Is have ABC");	
    }
	//@Override
	public void drive() {
	System.out.println("Can drive manualy");	
		
	}
	
		
	}
