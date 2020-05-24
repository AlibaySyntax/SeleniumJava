package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		/* create an array of cars:
		 * american, german, korean, italian
		 * then retrieve all values from that array using s different loops
		 */
		
		
		
		
		
		
		
		
		
		
		/*
		 * create an array of countries;
		 * north america countries
		 * south america countries
		 * europe countries
		 * asian countries
		 * Then print all values from that array using
		 * 2 different loops and calculate 
		 * how many total countries been stored
		 */
		String [][] countries = {
				{"Canada", "Mexico", " USA"},
				{"Colombia", "Paraguay", "Ecuador"},
				{"Poland", "Austria", "Portugal"},
				{"Philippines", "Cambodia", "Vietnam", "Indonesia"},
				{"Moroco", "south Africa", "Namibia", "Uganda", "Eritrea"}
		};
		int total=0;
		for (int x=0; x< countries.length; x++) {
			for (int y=0; y<countries[x].length; y++) {
				System.out.println(countries[x][y] + " ");
				total++;
			}
			System.out.println("Total: " + total);
		}
		System.out.println("-----Using advanced for loop------");
		
		int count =0;
		for (String [] world : countries) {
			for (String c : world) {
				System.out.println(c + " ");
				count++;
			}
			System.out.println();
			
		}
		System.out.println("total = " + count);
		

	}

}
