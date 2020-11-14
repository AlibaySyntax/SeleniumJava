package syntax05Scanner;
import java.util.Scanner;
public class ScannerHomeWork {

	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("Do you use credit card ");
		String answer=userInput.nextLine();
		
		if (answer.equals("Yes")) {
			System.out.println("what is current balance on your credit");
			double c=userInput.nextDouble();
		    if(c>=100) {
		    	System.out.println("Please pay off dues immediately");
		    }else {
		    	System.out.println("Please spend more to get higher credit limit");
		    }
		    }else {  	
		    	System.out.println("We have a great Credit card offer for you");
		    }
		        System.out.println("---------------------------------------------");
		
		        Scanner Input=new Scanner(System.in);
				System.out.println("Do you use credit card ");
			boolean answer1=userInput.nextBoolean();
				
		    if (answer1) {
				System.out.println("what is current balance on your credit");
			double c=userInput.nextDouble();
			if(c>=100) {
				System.out.println("Please pay off dues immediately");
			}else {
			    System.out.println("Please spend more to get higher credit limit");
			}
			}else {  	
				System.out.println("We have a great Credit card offer for you");
}}}