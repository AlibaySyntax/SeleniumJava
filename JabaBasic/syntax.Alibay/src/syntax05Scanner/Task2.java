package syntax05Scanner;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/* write a program that will print weekend or weekday
		 * 1-5 day-->it is a weekday
		 * 6-7 --> it's weekend
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your day");
		
		int day = scan.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("It is weekday");
		}else if ( day >=6 && day<=7) {
			System.out.println("It is weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
