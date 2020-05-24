package com.syntax03;

public class Task3 {

	public static void main(String[] args) {
		//widening,happens, implicitly.
		
		
		double d=10;
		      System.out.println(d);//10.00
		      
		      // int i=10.99--->compile time error saying;
		      // type mismatch, cannot convert double to int
		      //narrowing, explicitly implementing.
		      
		      int i=(int)10.99;
		          System.out.println(i);
		      //byte -128 to 127
		      byte b=(byte) 1284;
		          System.out.println(b);
		          
		   //We can use "int" and "byte" instead of 'float' and 'double'.
		          
		

	}

}
