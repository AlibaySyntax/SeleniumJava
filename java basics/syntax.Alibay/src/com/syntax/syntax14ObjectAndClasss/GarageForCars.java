package com.syntax.syntax14ObjectAndClasss;
public class GarageForCars {
public static void main(String[] args) {
//Build individual objects
Car car1=new Car();
car1.make="Lamborghini";
car1.model="Gallarado";
car1.year=2020;
car1.color="Blue";

Car car2=new Car();
car2.make="BMW";
car2.model="M5";
car2.year=2019;
car2.color="Pink";

Car car3=new Car();
car3.make="123";
car3.model="G";
car3.speed=2020;
car3.color="Blue";
//Print Lamborghini
System.out.println(car1.make);
//Accessing behavior/method of car

CARwithVOID car4=new CARwithVOID();
car4.drive();
car4.accelerate();
car4.makeNoise();
car4.stop();
//Accessing behavior/method of car
car4.drive();
car4.stop();
car4.makeNoise();
car4.accelerate();

//I drive pink BMW
System.out.println("I drive: " +car2.color+" "+car2.make);
//Create bike object
//new Bike();--> cannot create an object an if we do not have a class

}}


