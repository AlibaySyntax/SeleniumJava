package com.syntax06Switch;
public class SwitchINTRO {
public static void main(String[] args) {
		
         int day=4;
		 String dayName; 
		if (day==1) {
			dayName=("Monday");
		}else if (day==2) {
			dayName=("Tuesday");
		}else if (day==3) {
			dayName=("Wednesday");
		}else if (day==4) {
			dayName=("Thursday");	
		}else if (day==5) {
			dayName=("Friday");	
		}else if (day==6) {
			dayName=("Saturday");	
		}else if (day==7) {
			dayName=("Sunday");	
		}else {
			dayName=("Unknown");	
}
		System.out.println("Today is " +dayName);
        System.out.println("----------------USING SWITCH----------------");
        
        
        String today;
        switch (day){
        case 1:
        	today="Moday";
        	break;
        case 2:
        	today="Tuesday";
        	break;
        case 3:
        	today="Wednesday";
        	break;
        case 4:
        	today="Thursday";
        	break;
        case 5:
        	today="Friday";
        	break;
        case 6:
        	today="Saturday";
        	break;
        case 7:
        	today="Sunday";	
        	break;
        default:
        	today="Invalid";
        }
        System.out.println("today is " + today);        	
}}       	
        	
        	
        	
        	
        	
        	
     
