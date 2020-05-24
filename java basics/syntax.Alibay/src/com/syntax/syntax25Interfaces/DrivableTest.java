package com.syntax.syntax25Interfaces;
public class DrivableTest {

public static void main(String[] args) {

Drivable obj=new Car();
//Drivable.MOVE_FAST=false; No work.
obj.drive();
Car car =new Car();
car.drive();
car.stop();
}

}
