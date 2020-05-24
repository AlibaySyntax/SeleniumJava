package com.syntax24Abstract;
public class VehicleTest {

public static void main (String[] args) {
//new Vehicle("Yellow");
//new Car("Sedan", "Yellow");
Vehicle tesla=new Tesla("yellow ", "sedan ","tesla ");
tesla.drive();
tesla.stop();
tesla.brake();
tesla.start();
tesla.belt();
//tesla.display(); CE; method is not defined in vehicle
new Toyota("red ","sedan ","toyota ");
new Toyota("blue ","sedan ","toyota ");
Vehicle.total();

new Bus("yellow ","passenger ","bus ");
}}

