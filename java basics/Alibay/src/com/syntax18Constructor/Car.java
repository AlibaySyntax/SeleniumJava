package com.syntax18Constructor;
public class Car {
 
String make, model, color;
int year,door,wheels;
	
public void printDetails() {
System.out.println("I have: "+year+ ", "+make+ ", "+model+ ", in: " +color+ ", color");
}
public static void main(String[]args) {
		
Car car=new Car();
car.make="BMW";
car.model="m5";
car.year=2020;
car.color="Blue";
car.door=2;
car.wheels=5;
		
car.printDetails();
System.out.println("----------------------");
}

//Car car1=new Car();
//car1.printDetails();
//System.out.println(car1.year);
		
//int doors ;
///System.out.println(door);//needs initialize
} 

