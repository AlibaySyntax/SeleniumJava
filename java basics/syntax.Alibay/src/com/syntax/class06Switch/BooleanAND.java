package com.syntax.class06Switch;
import java.util.Scanner;
public class BooleanAND {

	public static void main(String[] args) {
		
                  Scanner scan=new Scanner(System.in);
		          System.out.println("Please enter number of the day");
		          
		          int day=scan.nextInt();
		          
		          if (day>=1 && day<=5) {
		            System.out.println("It's a weekday");
		          }else if(day>=6 && day<=7) {
		            System.out.println("It's a weekday");
	               
	              }else {
	            	  System.out.println("Invalid day");
	}

}}

