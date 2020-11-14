package com.syntax.syntax14ExceptionHandlings;

public class InfoAboutException {

public static void main(String[] args) {
		
String str="Hello";

try {
char character=str.charAt(10);//=new StringIndexOutOfBoundsException():
System.out.println(character);
}catch(StringIndexOutOfBoundsException se) {
//To get info about the Exception
//se.printStackTrace();// name,message about Ex, where it occurs
//System.out.println(se);//name,message about Ex
System.out.println(se.getMessage());
}
System.out.println("---END OF THE PROGRAM---");
}
}
