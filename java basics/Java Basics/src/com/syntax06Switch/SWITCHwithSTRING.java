package com.syntax06Switch;
import java.util.Scanner;
public class SWITCHwithSTRING {

	public static void main(String[] args) {
		/* Ask a user where he or she is from
		 * based on the county we will define favorite food
		 *Your favorite food is ___*/
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country.toLowerCase()) {
		case "morocco":
			favoriteFood="couscous";
			break;
		case "belarus":
			favoriteFood="Potao";
			break;
		case "tajikistan":
			favoriteFood="Osh";
			break;
		case "turkey":
			favoriteFood="Baklava";
			break;
		case "afganistan":
			favoriteFood="Mantu";
			break;
		case "kazakhstan":
			favoriteFood="Beshparmak";
			break;			
		default:
			favoriteFood="Unknown";
			}
		System.out.println("Your favorite food is: " +favoriteFood);	
}}



