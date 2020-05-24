package com.syntax18Constructor;
public class BestCar {

	String make,model, color;
	int year, door, wheels;
public void printDetails() {
System.out.println("I have "+year+", "+make+ ", "+model+ ", in: " +color+", color ");
System.out.println(make+ "Has "+door+" door and "+wheels+" wheels");
}
BestCar(String carMake, String carModel,String carColor, int carYear, int carDoor, int carWheels){
	make=carMake;
	model=carModel;
	color=carColor;
	year=carYear;
	door=carDoor;
	wheels=carWheels;
}
public static void main(String[]args) {
//Once we creat our own constructor compiler WILL NOT be creating a default ccostructor for you!!!
//Best Car=new Best Car(); CE
BestCar car=new BestCar("BMW ","m5 ","Grey",2020 ,4 ,5);
car.printDetails();

//new BestCar("Toyota","Camry", 2020, 2, 4, "Blue"); CE: swap arguments
}
}
