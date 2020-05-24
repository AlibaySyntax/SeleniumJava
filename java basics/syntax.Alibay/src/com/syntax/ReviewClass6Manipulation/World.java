package com.syntax.ReviewClass6Manipulation;
public class World {
public static void main(String[] args) {
Baby baby1=new Baby();

System.out.println(baby1.cry());
//Assign value
baby1.firstName="John";
baby1.lastName="Smith";
baby1.gender='M';
baby1.weight=7;
baby1.hairColor="Black";

//Reassign value
baby1.weight=8;
System.out.println("baby1 firstName " +baby1.firstName);

String variable=baby1.lastName;
System.out.println("baby LastName " +variable);

String cryVeriable=baby1.cry();//another way
System.out.println(cryVeriable);
baby1.walk();
baby1.talk(3);

System.out.println("\n----Done with baby 1-----");

Baby baby2=new Baby();

System.out.println(baby2.cry());
baby2.firstName="Ann";
baby2.lastName="Atsoy";
baby2.gender='F';
baby2.hairColor="Yellow";
baby2.weight=6;

System.out.println("---------------------------");
baby1.displayBabyInfo();
System.out.println("---------------------------");
baby2.displayBabyInfo();
System.out.println("---------------------------");
}}


