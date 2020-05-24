package com.syntax.class06Switch;

public class RecapAND {

	public static void main(String[] args) {
		/*if hour between 1-11--> morning
		  *if hour between 12-15--> afternoon
		  *if hour between 16-20--> evening
		  *if hour between 21-24--> night */
		
		int hour=60;
		String timeOfDay;
		
		if (hour>=1 && hour<=11) {
			timeOfDay="Morning";
		}else if(hour>=12 && hour<=15) {
			timeOfDay="Afternoon";
		}else if(hour>=16 && hour<=20) {
			timeOfDay="Evening";	
		}else if(hour>=21 && hour<=24) {
			timeOfDay="Night";	
		}else {
			timeOfDay="Uknown";
		}// if time of the day is not unknown --> only then i want to see the message
		if (! timeOfDay.equals("Uknown")) {
			System.out.println("Right now is: " +timeOfDay);
			
			
			
			
			
			
			
			
			
		}

	}}


