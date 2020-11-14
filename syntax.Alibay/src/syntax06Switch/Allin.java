package syntax06Switch;

import java.util.Scanner;

public class Allin {
	
	public static void main(String[] args) {
		
		/*write a programm to ask user
		 * if there is a sale
		 * if there no sale--> not going to shopping
		 * if there sale--> we will ask the price of the item
		 * base on the price we will apply discount
		 * and calculate final price
		 * 
		 * if price less than 20--> apply 10%
		 * if price between 20-100--> 20%
		 * if price between 100 and 500 -->apply 30%
		 * if price more than 500-->apply 50%
		 * 
		 * after discount__the price of item reduce from___to___
		 */
		
		Scanner scan;
		String sale;
		double price = 0;
		double discount = 0;
		double finalPrice = 0;
		
		scan=new Scanner(System.in);
		System.out.println("Is there sale?");
		
		sale=scan.nextLine();
		
		
		if(sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price?");
			price=scan.nextDouble();
			
			 if(price <=20) {
			 discount=price*0.1;
			 
			 }else if (price>20 && price<100){
			 discount=price*0.2;
			 
			 
			 }else if (price >100 && price <=500) {
				 discount=price*0.3;
				 
			 }else {
				 discount=price*0.5;
				
			 }
			 
			 finalPrice=price - discount;
			 System.out.println("After " + discount + "discount the price of the item reduces from " 
	                    + price + " to " + finalPrice);
	 
		 }else {
			 System.out.println("No shopping today");
		 }
		
		
	}

	
	}


