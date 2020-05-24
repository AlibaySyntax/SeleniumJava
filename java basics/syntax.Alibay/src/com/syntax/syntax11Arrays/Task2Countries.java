package com.syntax.syntax11Arrays;
public class Task2Countries {
public static void main(String[] args) {
	
		    String [][]countries= {
				{" Canada, "," Mexico, "," USA, "},
				{" Columbia, "," Paraguai, "," Ecuador, "},
				{" Poland, "," Austria, "," Prtugal, "},
				{" Philipines, "," Combodjia, "," Vietnam, "," Indonesia, "},
				{" Morocco, "," South Arica, "," Namibia, "," Uganda, "," Eritrea, "},
            };
		    int total=0;
		    for (int x=0; x<countries.length; x++) {
		    	 for (int y=0; y<countries[x].length; y++) {
		    		 total++;
		    		 System.out.print(countries[x][y]+"");
		    	 }
		    	 System.out.println();
		         }
		         System.out.println(" Total: " + total);
		         System.out.println();
		         System.out.println("--Using Advanced for loop--");
		         System.out.println();
		         int count=0;
		         for(String []world:countries) {
		         for(String c:world) {
		        	 count++;
		        	 System.out.print(c+""+count);
		         }
		         System.out.println();
}}}
