package com.syntax.syntax15ExceptionHandlingAndFuncDevs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.io.FileNotFoundException;
public class ThrowExample {

public static void main(String[] args) throws Throwable  {
try {
multpleSleep();	
read("");
}catch(FileNotFoundException e) {
e.printStackTrace();
}
System.out.println("--end of the code----");
}
public static void read(String filepath) throws FileNotFoundException {
FileInputStream fis=new FileInputStream(filepath);	
}
public static void multpleSleep () throws Throwable {
	try {
sleep()	;			
}catch(InterruptedException e) {
e.printStackTrace();
}

}
public static void sleep() throws Throwable {
Thread.sleep(2000);	
}
}
