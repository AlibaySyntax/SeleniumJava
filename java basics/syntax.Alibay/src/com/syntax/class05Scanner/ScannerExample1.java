package com.syntax.class05Scanner;

import java.util.Scanner;

public class ScannerExample1 {
	

	public static void main(String[] args) {
		
		//Capture name from a user and
		//print in the format
		//My name is________
		// 1. Bring Scanner class into a program
        //System .in-->identifies keyboard
		Scanner scan=new Scanner(System.in);
		// Instruct user of what program expects
		System.out.println("Please enter your number");
		//capture line of String from a user
		
		String name= scan.nextLine();
		
		System.out.println("Now old are you?");
		
        int age= scan.nextInt(); 
        
             System.out.println("Your is" +" you age is "+age);
             
            
	}

}
