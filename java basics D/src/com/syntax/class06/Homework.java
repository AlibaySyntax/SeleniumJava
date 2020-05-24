package com.syntax.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*define the season.
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month = scan.nextLine();
		
		String season = null;
		
		if ((month.equals("January")) || (month.equals("February")) || (month.equals("December"))) {
		season="winter";	
				
		}else if ((month.equals("September")) || (month.equals("October")) || (month.equals("November"))) {
		season="autum";	
		
		}else if ((month.equals("June")) || (month.equals("July")) || (month.equals("August"))) {
			season="summer";	
		
        }else if ((month.equals("March")) || (month.equals("April")) || (month.equals("May"))) {
			season="spring";	
		
        }else {
        	//season="invalid";
        	System.out.println("Please enter valid month");
        }
        	System.out.println("You were born in " + season + "." );
        }
        }
		


