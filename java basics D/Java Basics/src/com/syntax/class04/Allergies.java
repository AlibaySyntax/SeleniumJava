package com.syntax.class04;

public class Allergies {

	public static void main(String[] args) {
		
		//check if patient have any allergies
		//if no allergies --> you are healthy
		//otherwise check if patient has:
		        // orange allergy --> do not eat oranges
		        // apple allergy --> do not eat apples
		        // kiwi allergy --> do not eat kiwis
		
		boolean allergies = true;
		boolean appleAllergy = false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy =false;
		
		if(allergies) {
			System.out.println("Please aswer bellow");
			
			if(orangeAllergy) {
				System.out.println("Don't eat oranges");
			}
			if (appleAllergy) {
				System.out.println("Dont eat aplles");
			}
			
			if(kiwiAllergy) {
				System.out.println("Dont eat kiwis");
			}
		} else {
			System.out.println("You are healthy");
		}

	}

}
