package com.syntax.syntax11Arrays;
public class moreExampels2Darray {
public static void main(String[] args) {
	//lets create 2D array in witch we store professions
	        String[][]professions= {
	        		{ "QA tester, ","Developers, ","Product owner, ","Scrum master"},
	        		{"Match teacher, ","Science Teacher, ", "ESL Teacher"},
	        		{"Dentist, ","Surgeon"},
	        };
	        //get elements using advanced for loop
	        for(String[] occupation:professions) {
		    for(String title:occupation) {
		    	System.out.println("title");
		    }
            System.out.println();
}}}
