package com.syntax.syntax14ExceptionHandlings;

import java.io.FileInputStream;

public class FinallyBlock {

public static void main(String[] args) {
		
String file=System.getProperty("user.dir")+"/configs/configuration.properties";
try {
FileInputStream fis=new FileInputStream(file);//new FileNotFounException();
} catch (Exception e) {
   System.out.println("I am a catch block");
}finally{//always gets executed
   System.out.println("I am a finally block");	
		
}
}}
