package Assignments;

public class Ass056 {

	public static void main(String[] args) {
		
		/*
		 * For you to do: 
Create a for loop that prints out even numbers from 2 to 14 using if condition

Must include the number 14 in the output 

Output:  
2
4
6
8
10
12
14
		 */
		
		
		int num =2;
		while(num<=14) {
			if (num%2!=0) {
				System.out.println(num);
			}
			num+=2;
		}

	}

}
