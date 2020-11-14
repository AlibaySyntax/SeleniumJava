package syntax04BooleanNested;

public class task1 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate
		 * and mortgage price.First, program should check if rate is his
		 * 
		 */
		int price =50000;
		double rate = 4.7;
		
		if (rate >4.5) {
			System.out.println("Mortgage very High");
		}else {
			System.out.println("yes, i'm buying a house");
			
			if (price>20000) {
				System.out.println("I need morgage");
			}else {
				System.out.println("I pay cash");
			}
		}

	}

}
