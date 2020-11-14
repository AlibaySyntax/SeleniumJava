package syntax05Scanner;

import java.util.Scanner;

public class NextvsNextln {

	public static void main(String[] args) {
		
		Scanner variable = new Scanner(System.in);
		
		System.out.println("Please enter A any text");
		String text = variable.next();
		
		
		System.out.println("Please eneter B any text");
		String text1 = variable.nextLine();
		
		System.out.println("Please enter C any text");
		String text2 = variable.nextLine();
		
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);

	}

}
