package com.syntax22Overload;
public class OverloadingMain {

public static void main(int [] args) {
System.out.println("Method with int array arguments");
}

public static void main(String args) {
System.out.println("Method with String arguments");
}

public static void main (String args,String args1) {
System.out.println("Method with 2 String arguments");
}

public static void main (String args, int num) {
System.out.println("Method with 2 String arguments");
}



public static void main(String[] args) {//java always looks main with this signature		
System.out.println("Method with String array argumrnt");
OverloadingMain.main("str");
main("str");
main("hello","hi");
//int[]arr=new int[2];
main(new int[2]);
}}