package com.syntax.ReviewClass2Logicaloperator;
import java.util.Scanner;
public class ORoperatorRichBoy {
public static void main(String[] args) {

  Scanner input=new Scanner(System.in);
  System.out.println("Are you Boy or Girl?");
				
  String boyGirl=input.next();
  System.out.println("Are you rich true/false?");
  boolean rich=input.nextBoolean(); 
		      
System.out.println("You are a "+boyGirl+ " and you are rich: "+rich);

if(boyGirl.equals("boy")|| rich) {
	 //true=if only rich boy
	 System.out.println("Buy a Ferrari.");
	 
}else if(boyGirl.equals("boy")|| !rich) {
	 //false=only poor boy
	 System.out.println("Play sports ");
	 
}else if(boyGirl.equals("girl")|| rich) {
	 //true=only rich girl
	 System.out.println("Buy Louis Vuitton");
	 
}else if (boyGirl.equals("girl")|| !rich) {
	 //false=only poor girl
	 System.out.println("Read book");
}else {
	 //nether boy or girl
	 System.out.println("You entered a wrong choice");
}}}
