package syntax05Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		/* if declared number is 
		 * between 1-10-->small
		 * between 11-100--> big 
		 * between 101-1000--> large
		 */
		
		int num=78;
		
		if (num>=1&& num<=10) {
			System.out.println("This is small number");
		
		}else if (num>10 && num<=100) {
			System.out.println("This is big number");
			
		}else if (num>100 && num<=1000) {
			System.out.println("This is lalge number");
		}else {
			System.out.println("Number is super large");
		}

	}

}
