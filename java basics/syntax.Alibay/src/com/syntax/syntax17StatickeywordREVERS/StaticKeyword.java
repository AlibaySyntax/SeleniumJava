package com.syntax.syntax17StatickeywordREVERS;
public class StaticKeyword {
//Create a template for a phone
	String color;
	int memory;
	
static String brand;
static boolean touchScreen;
//return type, name, parameters
static void displayGeneralInfo() {
System.out.println("We are building "+brand+" with toch screen= "+touchScreen);
}
//Instance members of the class can access ALL STATIC members
void displaySpecifications() {
System.out.println("We build phone with "+memory+" GB memory in "+color+" color");
}
//STATIC METHODS CANNOT ACCES NON-STATIC MEMBERS OF THE CLASS
public static void main(String[]args) {
	brand="iphone";
	touchScreen=true;
	
	StaticKeyword obj=new StaticKeyword();
	obj.color="grey";
	obj.memory=64;
	//Accessing static method in a static way
	displayGeneralInfo();//static void 
	obj.displaySpecifications();//void 
	
}

	
}

