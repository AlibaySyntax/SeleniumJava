package com.syntax05Scanner;

public class LOGICALwithhNOT {

	public static void main(String[] args) {
		
		boolean b =!true;
		boolean val=!false;
		System.out.println(b);
		System.out.println(val);
	   
		boolean isCold=false;
		if(!isCold) {
		System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		String day1="Monday";
		String day2="Friday";
		//if it is not monday or friday --> Find me at Syntax
		
		if (!(day1.equals("Monday")&& !day1.equals("Friday"))) {
			System.out.println("Find me at Sidney");
		}
		//day is not monday and my day is not friday
		if (!(day1.equals("Monday") && day1.equals("Friday"))) {
				System.out.println("Find me at Syntax");
				
		
}}}


