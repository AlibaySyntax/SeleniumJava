package com.syntax.syntax34ExceptionHandlingAndFuncDevs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.io.FileNotFoundException;
public class ThrowExample {
public static void main(String[] args) {

multpleSleep();	
read("");
}catch(FileNotFoundException e) {
	e.printStackTrace();

System.out.println("--end of the code----");
}
public static void read(String filepath)throw FileNotFoundException{
FileInputStream fis=new FileInputStream(filePath);	
}
public static void multpleSleep () {
	try {

sleep()	;
}catch(InterruptedException e) {
e.printStackTrace();
}
public static void sleep() throw InterruptedException{
Thread.sleep(2000);	
}
}
