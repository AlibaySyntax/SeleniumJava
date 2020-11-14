package syntax08Loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*1.
		 * write program that reads a range of integers
		 * (start and end portion), provided by a user
		 * and then from that range prints the sum of the even and odd integers
		 * 2.
		 * write a program to ask a user to enter item they want to buy
		 * and the price of that item.
		 * every time user enters money accumulate the amount 
		 * and tell the user how much is left to pay off.
		 * if user give more money, program should return a change.
		 * whenever a user done with payments program,
		 * should say"Thank you for shopping!"
		 */
		
		Scanner scan = new Scanner(System.in);
		int totalEven = 0;
		int totalOdd = 0;
		System.out.println("Please enter two numbers:");
		int min = scan.nextInt();//10
		int max = scan.nextInt();//20
		for(int i = min; i<=max; i++) {
			if(i%2==0) {
				totalEven = totalEven + i;
			}else {
				totalOdd = totalOdd =i;
				
			}
			System.out.println("The total of even numbers between" + min + " to " + max + "is" + totalEven);
			System.out.println("The total of odd numbers between " + min + "to" + max + " is " +  totalOdd);
		}
		System.out.println("=======task2======");
		
		Scanner s;
		String item;
		double price;
		double money;
		double amount = 0;
		double change;
		double remainingBalance;
		
		s=new Scanner(System.in);
		System.out.println("What are you buying today");
		item=s.nextLine();
		
		System.out.println("What is the for the " + item);
		price = s.nextDouble();
		
		do {
			System.out.println("Please give payment");
			money=s.nextDouble();
			
			amount=amount+money;
			
			if(amount<price){
				remainingBalance = price -money;
				
			}else if(amount>price) {
				change=amount-price;
				System.out.println("Here is your change" + change );
				break;
				
			}else {
				System.out.println(" Thank you");
			}
		}while(price!=money);
		System.out.println("Thank you for shopping");
		
		
	

	}

}
