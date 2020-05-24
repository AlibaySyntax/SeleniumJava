package com.syntax26Encapsulation;
public class Recap {

public static void main(String[] args) {
int num=10;
Doctor doctor=new Doctor();

int[]numbers= {10,20,30,40};
Doctor[]doctors= {new Doctor(), new Doctor(),new Doctor()};

String[] names=new String[2];
names[0]="Vital";
names[1]="Gulam";

System.out.println("-----");
//During runtime we java will give an exaptions because array 
names[2]="Jawid";


}

}
