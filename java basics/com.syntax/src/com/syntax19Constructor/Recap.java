package com.syntax19Constructor;
public class Recap {
Recap(){
System.out.println("Constructor with no Arguments");
}
Recap(int num){
System.out.println("Constructor with 1 Parameter");
}
public static void main(String[]args) {
Recap obj=new Recap();
}
}
