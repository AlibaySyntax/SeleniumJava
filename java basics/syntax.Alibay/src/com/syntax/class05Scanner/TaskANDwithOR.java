package com.syntax.class05Scanner;

public class TaskANDwithOR {

	public static void main(String[] args) {
		
		int day=5;
		if (day>=1 && day <=5) {
			System.out.println("It is a weekday");
		}else if (day >=6 || day <=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
			
  }System.out.println("---------using OR---------------");
  
	    if (day==1 || day==2 || day==4 ||day==5) {
		    System.out.println("It is a weekday");
	    }else if (day ==6 || day ==7) {	
		    System.out.println("It is a weekend");
	    }else {
		    System.out.println("Invalid day");
	}}}
