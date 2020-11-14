package com.syntax.syntax34ExceptionHandlingAndFuncDevs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

public static void main(String[] args)  {

multipleSleep();
try {
	read("");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("---end of the code---");
}
public static void read(String filePath) throws FileNotFoundException {
FileInputStream fis =new FileInputStream(filePath);//new FileNotFoundExcaption
}

public static void multipleSleep() {
try {
	sleep();
} catch (InterruptedException e) {
	e.printStackTrace();
}
}
public static void sleep() throws InterruptedException {
Thread.sleep(2000);

}	
}

