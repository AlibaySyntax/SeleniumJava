package syntax08LoopBreanCont;
import java.util.Scanner;
public class TASK4ScannerShopping {

	public static void main(String[] args) {
		Scanner s;
		String item;
		double price;
		double money;
		double amount=0;
		double change;
		double remainingBalance;
		
		s=new Scanner(System.in);
		System.out.println("What are you buying today?");
		item=s.nextLine();
		
		System.out.println("What is the price for the: "+item);
		price=s.nextDouble();
		
		do {
			System.out.println("Please give payment...");
			money=s.nextDouble();
			amount=amount+money;
			
			if(money<price) {
				remainingBalance=price-amount;
				System.out.println("Please give more: "+remainingBalance);	
			}else if(money>price) {
				change=money-price;
				System.out.println("Here is change: "+change);
				amount=s.nextDouble();
				break;
			
			//}else {
				//System.out.println("We got your correct payment");
			}
		}while(price!=amount);
		System.out.println("Thank you for shopping !!! ");
}}

