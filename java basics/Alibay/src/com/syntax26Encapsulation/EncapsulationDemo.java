package com.syntax26Encapsulation;

//import REPLtests.Test174EncapsulationDemo;

public class EncapsulationDemo {
//Define private variable
private String name;
private int age;
private double salary;
//Define public methods to give an access to private variables
public String setName;
public int setAge;

public String getName() {
return name;
}
public int getAge() {
return age;
}
public double getSalary() {
return salary;
}
//setters
public void setName (String name) {
if(!name.isEmpty() && name.length()>3) {
this.name=name;	
}}
public void setAge (int age) {
this.age=age;
}
public void setSalary (double salary) {
this.salary=salary;
}

public static void main(String[] args) {

EncapsulationDemo emp=new EncapsulationDemo();
emp.setName("Mario");
emp.setAge(32);
System.out.println("Employee Name: " + emp.getName());
//System.out.println(emp.getempAge());
System.out.println("Employee Age: " + emp.getAge());	
}}
