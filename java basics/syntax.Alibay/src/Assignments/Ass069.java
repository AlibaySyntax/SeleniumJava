package Assignments;

public class Ass069 {

	public static void main(String[] args) {
		
		/*
		 * For you to do: 
Write a program to print out the pattern: 

1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7
		 */
		
		
		for(int i=7; i>=1; i--) {
			for(int k=1; k<=i; k++) {
				System.out.print(k +"");
			}
			System.out.println();
		
		}
		for(int i=2; i<=7; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(k+"");
			}
			System.out.println();
		
		}

	}

}
