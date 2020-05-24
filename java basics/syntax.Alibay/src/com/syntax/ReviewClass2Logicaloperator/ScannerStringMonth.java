package com.syntax.ReviewClass2Logicaloperator;
import java.util.Scanner;
public class ScannerStringMonth {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 System.out.println("Enter a number for the month:");
	 int month = scan.nextInt();
	 
	 System.out.println("The month you entered is: "+ month);
	 
	String monthString;
    if (month==1) {
    	monthString="January";
    
    }else if(month==2) {
    	monthString="February";
    
    }else if(month==3) {
    	monthString="March";
    }else if(month==4) {
    	monthString="April";
    }else if(month==5) {
    	monthString="May";
    //System.out.println("May");
    }else if(month==6) {
    	monthString="June";
    //System.out.println("June");
    }else if(month==7) {
    	monthString="July";
    //System.out.println("July");
    }else if(month==8) {
    	monthString="August";
    //System.out.println("August");
    }else if(month==9) {
    	monthString="September";
    //System.out.println("September");
    }else if(month==10) {
    	monthString="October";
    //System.out.println("October");
    }else if(month==11) {
    	monthString="November";
    //System.out.println("November");
    }else if(month==12) {
    	monthString="December";
    //System.out.println("December");
    }else {
    	
     System.out.println("Invalid month");
    }
    System.out.println("The month is Wrong");
}}






