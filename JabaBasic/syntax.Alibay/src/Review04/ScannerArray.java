package Review04;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		// use scanner to ask for size of the array
		//then, read numbers from the scanner into the array
		//then print the whole array
		Scanner scan= new Scanner(System.in);
		System.out.println("How many elemnts do you want to store, body?");
		int size = scan.nextInt();
		System.out.println(size);
		// i am creating an array with size = whatever he/she gave us
		int[] nums = new int [size];
		//this for loop inserts numbers into array
		for(int i=0; i<size; i++) {
		System.out.println("Give me a number to store in the array!");
		nums[i] = scan.nextInt();
		}
		
		System.out.println("Lets see what you gave me:");
		//this enhanced for loop reads numbers from the array
		for(int n:nums) {
			System.out.println(n);
		}

	}

}
