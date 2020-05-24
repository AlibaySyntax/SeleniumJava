package com.syntax.class05Scanner;

public class moreLogicalOperators {

	public static void main(String[] args) {
		/*We have total 7 days in a week
		 *if day is 2,3-->SDLC class
		 * if day 6,7 --> Java class
		 * if day 1,5 --> Off day
		 * if day 4 --> review class*/ 
        int day=5;
        day=7;
        // To compare 2 number we use equality operator(==)
		if(day==2 && day==3) {
		    System.out.println("Today is SDLC class");
		}else if(day==6 && day==7) {
			System.out.println("Today is JAVA class");
		}else if(day==7 && day==5) {
			System.out.println("Today is no class");
		}else if(day==4) {
			System.out.println("Today is review class");
	}else {
			System.out.println("INVALID day");	
System.out.println("---------using OR------------------");

int day1=5;
day=7;
// To compare 2 number we use equality operator(==)
if(day==2 && day==3) {
    System.out.println("Today is SDLC class");
}else if(day==6 | day==7) {
	System.out.println("Today is JAVA class");
}else if(day==7 || day==5) {
	System.out.println("Today is no class");
}else if(day==4) {
	System.out.println("Today is review class");
}else {
	System.out.println("INVALID day");
System.out.println("--------------using String-and OR--------------");	

// To compare String we use equals
String day2="Saturday";

if (day2.equals("tuesday") || day2.equals("Wednesday")) {
	 System.out.println("Today is SDLC class");
}else if (day2.equals("Saturday") || day2.equals("Sunday")) {
	 System.out.println("Today is JAVA class");
}else if(day2.equals("Monday") || day2.equals("Friday")) {
	System.out.println("Today is no class");
}else if(day2.equals("Thursday")) {
	System.out.println("INVALID day");
	
}}}}}

