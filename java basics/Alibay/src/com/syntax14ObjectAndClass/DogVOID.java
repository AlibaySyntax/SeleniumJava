package com.syntax14ObjectAndClass;
public class DogVOID {

String dreed;
String name;
String color;
int age;
String breed;


public static void main(String[] args) {
		
DogVOID dog1=new DogVOID(); 
dog1.name="Alabay";
dog1.color="Black";
dog1.breed="Candin";
dog1.age=2;


dog1.bark();
dog1.eat();
dog1.run();

DogVOID dog2=new DogVOID();
dog2.name="Barbos";
dog2.color="Yelow";	
dog2.breed="Laika";
dog2.age=3;


dog2.bark();
dog2.eat();
dog2.run();

}
void eat() {
System.out.print(name+ " dog can eat ");
}

void bark() {
System.out.print(name+ " dog can bark ");
}

void run() {
System.out.println(name+ " dog can run ");	

}		

}

