package syntax05Scanner;
import java.util.Scanner;
public class SCANNERandLOGICALimproved {

	public static void main(String[] args) {
				/*You are a salesman
				 * ask a user for how much his sales are
				 * based on the amount of sales we need to calculate commission
				 * if sales is between 1-100--> commission should be 10%
				 * if sales is between 100and200--> commission should be 30%
				 * if sales is between 200and500--> commission should be 30%
				 * if sales more than 500 --> commission should be 50%*/
				 // if your sales are 200 --> 40
				 //1. your sales all variable that I will need
				Scanner scan;
				double sales;
				double commission;
				
				scan=new Scanner(System.in);
				System.out.println("Please enter your sales amount");
				sales=scan.nextDouble();
				
				if (sales>=1 && sales<=100) {
					//give user 10% commission
					commission=sales;
					System.out.println("Commission 10%: "+ sales*0.1+ "$");
				}else if (sales>100 && sales<=200) {
					//give user 20% commission
					commission=sales;
					System.out.println("Commission 20%: "+sales*0.2+ "$");
				}else if(sales>200 && sales <=500) {
					//give user 30% commission
					commission=sales;
					System.out.println("Commission 30%: "+sales*0.3+ "$");
				}else {
					commission=sales;
					System.out.println("Commission 50%: "+sales*0.5+ "$");
				}	
	System.out.println("Based on your sales  is: " +commission+ "$");

			//if commission is > 100 --> you are awesome seller
			if (sales>100) {
				System.out.println("You are awesome seller.");
}}}

