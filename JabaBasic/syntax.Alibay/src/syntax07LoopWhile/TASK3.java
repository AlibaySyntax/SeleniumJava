package syntax07LoopWhile;
import java.util.Scanner;
public class TASK3 {

	public static void main(String[] args) {
// we are playing a lottery and a lucky number is 17;
// We want to keep asking users any number from 1-20
//Until he guess the lucky number -->congrats
		
		Scanner scan;
		int number;
		int luckyNumber=3;
		scan=new Scanner(System.in);
		
		do {
		System.out.println("Please enter any number from 1 to 20");
		number=scan.nextInt();
		}while(number!=luckyNumber);
		System.out.println("You lucky number it !!!");
}}

