package com.syntax06Switch;
import java.util.Scanner;
public class AllinOne {
public static void main(String[] args) {	
	/* write program to ask user if there is a sale
	 * if no sale --> not going shopping
	 * if sale we will ask the ask the price of the item
	 * based on on the price we will apply discount and calculate final price
	 * 
	 * if price less than 20 ---> apply 10%
	 * if price between 20 and 100 --> apply 20%
	 * if price between 100 and 500 --> apply 30%
	 * if price more than 500 --> apply 50%
	 * After discount _ the price of the item  reduced from _ to _
	 */
	      Scanner scan;
	      String sale;
	      double price=0;
	      double discount=0;
	      double finalPrice=0;
	      
	      scan=new Scanner(System.in);
	      System.out.println("Is here sale");
	      sale=scan.nextLine();
	      if (sale.equalsIgnoreCase("yes")){// for using upper case needs add <<IgnoreCase>>
	    	  System.out.println("What is the price");
	    	  price = scan.nextDouble();
	    	  if (price<=20) {
	    		  discount=price*0.1;
	    		  //finalPrice=price-discount;
	    	  }else if (price>20 && price <=100) {
	    		  discount=price*0.2;
	    		  //finalPrice=price-discount;
	    	  }else if (price>100 && price <=500) {
	    		  discount=price*0.3;
	    		  //finalPrice=price-discount;
	    	  }else {
	    		  discount=price*0.5;
	    		  //finalPrice=price-discount;}
	    	  }
	          finalPrice=price-discount;
	          System.out.println("After "+discount+" discount price of the item reduced from "+price+" to "+finalPrice+"");
	      }else {    System.out.println("No shopping today");
}
}}
