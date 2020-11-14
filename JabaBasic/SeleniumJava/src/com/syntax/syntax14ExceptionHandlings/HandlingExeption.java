package com.syntax.syntax33ExceptionHandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingExeption {

public static void main(String[] args) {

try {
Thread.sleep(2000);// =new InterruptedException ();
}catch (InterruptedException e) {	
}
System.out.println("continue to next try block");

String fPath="";
try {
FileInputStream fis=new FileInputStream(fPath);
}catch(FileNotFoundException fne) {
System.out.println("Catched FileNotFoundException Exception");
}
System.out.println("continue to next try block");

int a=10;
int b=0;

try {
System.out.println(a/b);// =new ArithmeticException();
System.out.println("I am code inside try block");// This block will get ignore if Exception occurred
}catch(ArithmeticException ae) {
System.out.println("Catched ArithmeticException Exception");
}
System.out.println("End of the program");
}
}
