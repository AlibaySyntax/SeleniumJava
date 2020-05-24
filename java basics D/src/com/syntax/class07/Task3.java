package com.syntax.class07;

public class Task3 {

	public static void main(String[] args) {
		/*creat a boolean variable workDay and asign true
		 * creat int variable day and assign it to 1
		 * as long a sit ia workDay print"I need a day off"
		 * and increase day
		 * once day is 6 print " I do not need a day off any more"
		 */
		
		boolean workDay=true;
		int day=1;
		while(workDay) {
			if(day<6) {
				System.out.println("I need day off");
			}else {
				System.out.println("I do not need a day off anymore");
				workDay=false;
			}
			day++;
		}

	}

}
