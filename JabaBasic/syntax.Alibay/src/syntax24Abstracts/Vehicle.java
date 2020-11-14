package syntax24Abstracts;
public abstract class Vehicle {

static int totalVehicles;

String color;
Vehicle(String color){
this.color=color;
totalVehicles++;
}
public static void total() {
System.out.println("We build "+ totalVehicles);	
}
public void drive() {
System.out.println("Vehicle drives");
}
public void stop() {
System.out.println("vehicle stops");
}
public void belt() {
System.out.println(" have belt");
}
public abstract void start();
public abstract void brake();
}
class Bus extends Vehicle{
Bus(String color) {
super(color);
		
}
Bus(String color, String passenger, String bus) {
super(color);
}
@Override
public void brake() {
System.out.println("bus should brake at red light camera");	
}
@Override
public void start() {
System.out.println("bus can drive fast");	
}
// Can abstract static? NO
//public abstract static void  m1();
//Can abstract final? NO
//public abstract static void  m2();
//Can abstract private? NO
//public abstract static void  m3();
}
abstract class Car extends Vehicle {
String carType;
Car(String color, String carType) {
//this.carType=carType;CE: Never use above super
super(color);
this.carType=carType;
}
public void brake() {
System.out.println(carType+ " have brake");
}
}
class Tesla extends Car{//TESLA
String make;
Tesla(String color, String carType, String make){
super(color,carType);
this.make=make;
}
@Override
public void start() {
System.out.println(make+" starts remotly");
}
@Override
public void drive () {
System.out.println(make+" drive on autopilot");
}
@Override
public void belt() {
System.out.println(make+" have belt");
}
}
class Toyota extends Car{//TOYOTA
String make;
Toyota (String color,String carType, String make){
super(color,carType);
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
}
