package com.syntax.ReviewClass2Logicaloperator;

public class SWITCHcapitalCity {
public static void main(String[] args) {
	
		String country="China";
		String capitalCity="";
		
		switch ("country") {
		case "USA":
			capitalCity= "Washington DC.";
			break;
		case "Russia":
			capitalCity= "Moscow.";
			break;
		case "China":
			capitalCity= "Pekin.";
			break;
		case "Albania":
		    capitalCity= "Tirana.";
		    break;
		case "Pakistan":
			capitalCity= "Islamabad.";
		case "Turkey":
			capitalCity= "Ankara.";
			break;
		default:
			capitalCity= "Not in a list.";
			break;
		}
System.out.println("The capital city of "+country+" is: " +capitalCity);
}}
