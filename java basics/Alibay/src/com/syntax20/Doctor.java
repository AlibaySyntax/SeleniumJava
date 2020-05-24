package com.syntax20;
public class Doctor {
	
int doctorId;
String name;

public Doctor(String name, int doctorId) {
this.name=name;
this.doctorId=doctorId;
}
}
class Dentist extends Doctor{
Dentist(String name, int doctorId){
super(name,doctorId);	
}
}
