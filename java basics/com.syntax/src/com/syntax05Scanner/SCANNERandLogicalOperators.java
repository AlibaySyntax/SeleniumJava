package com.syntax05Scanner;
import java.util.Scanner;
public class SCANNERandLogicalOperators {

	public static void main(String[] args) {
		
				 
				int age;
				Scanner scan;//to import we use mac: cmd+shift+0
				
				scan=new Scanner(System.in);
				System.out.println("Please enter your age");
				age=scan.nextInt();

				     if(age>0) {
				     if(age<3) {
					 System.out.println("You are Baby");
				  }else{if(age>=4 && age<=5) {
					 System.out.println("You are Kid");
				  }else{if(age>=6 && age<=12) {
					 System.out.println("You are Child");
				  }else{if(age>=13 && age<=19) {
					 System.out.println("You are Teenager");
				  }else{if(age>=20 && age<=64) {
					 System.out.println("You are Adult");
				  }else {
					 System.out.println("You are enjoing you life");}
				  }
				  if(age>100) {
		             System.out.println("Please enter valid age");}}}}}}}






