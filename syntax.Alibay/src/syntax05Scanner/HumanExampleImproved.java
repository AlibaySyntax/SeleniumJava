package syntax05Scanner;

import java.util.Scanner;

public class HumanExampleImproved {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age = scan.nextInt();
		
		String human;
		
		if(age<3) {
			human="baby";
		}else if(age>3 && age<=5) {
			human="kid";
		}else if (age>6 && age<=12) {
			human="child";
		}else if (age>13 && age<=19) {
			human="teen";
		}else if (age>20 && age<=64) {
			human="adult";
		}else {
			human="senior";
		}
			System.out.println("you are " + human);
			if(human.equals(" teen ")) {
				System.out.println(" parents good luck ");
			}
		}

	}


