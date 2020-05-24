package com.syntax.class05;

public class MoreLogicalOperator {

	public static void main(String[] args) {
		/*we have total 7 days in a week
		 * if day is 2,3-->sdlc class
		 * if day 6,7 -->java class
		 * if day1,5---> off day
		 * if day4---> review class
		 */
		int day=6;
		
		    if (day==2 || day==3) { //&& is wrong it will give false
			System.out.println("Today is SDLC Class");
				
		}else if (day==6 || day==7) {
			System.out.println("Today is Java Class");
		}else if (day==1 || day==5) {
			System.out.println("Today is off");
		}else if (day==4) {
			System.out.println("Today is review day");
		}else {
			System.out.println("Invalid day");
		}
	
	

		    System.out.println("-----------using string_________");
		    
		    String day1="Saturday";
		    
		    if(day1.equals("Tuesday") || day1.equals("Wednesday")) {
		    System.out.println("Today is SDLC Class");	
		    
		    }else if (day1.equals("Saturday") || day1.equals("Sunday")) {
		    	
		    }else if (day1.equals("Monday") || day1.equals("Friday")) {
		    	
		    }else if (day1.equals("Thursday")) {
		    	
		    }else {
		    	System.out.println("Unknown DAy");
		    }
	}

}
