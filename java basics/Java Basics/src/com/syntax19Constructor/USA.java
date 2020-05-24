package com.syntax19Constructor;
public class USA {
	String state, stateCapital;
public USA(String state, String stateCapital) {
	this.state=state;
	this.stateCapital=stateCapital;
}
public void screenState() {
System.out.println(state);
}
public void displayCapital() {
System.out.println(stateCapital);
}
//Can I call 1method another method? -->YES
public void displayInfo() {
//this.displayState();do not use this value	
screenState();//by default compiler add this keyword to a method
displayCapital();
}

public static void main(String[]args) {
USA state1=new USA("Texas","Austin");
//state1.screenState();
//state1.displayCapital();
state1=new USA("Gorgia","Alanta");
state1.displayInfo();
}
}