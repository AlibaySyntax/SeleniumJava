package com.syntax.syntaxREPL;

import com.syntax26Encapsulation.EncapsulationDemo;

public class Test172EncapsulationDemoGetSet {


private String empName;
private int empAge;

public String getempName(){
    return empName;
}

public int getempAge(){
    return empAge;
}

public void setempAge(int newValue){
    empAge = newValue;
}
public void setempName(String newValue){
    empName = newValue;
}
//For Test172 MAIN 172 
public static void main(String[]args) {
Test172EncapsulationDemoGetSet obj=new Test172EncapsulationDemoGetSet();
obj.setempName("Johny");
obj.setempAge(30);

System.out.println("Employee Name: " + obj.getempName());
System.out.println("Employee Age: " + obj.getempAge());

}}
