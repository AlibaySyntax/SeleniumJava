package Assignments;

public class Ass062 {

	public static void main(String[] args) {
		
		/*
		 * For you to do: 
Using for loop Print 1 to 10 Numbers except 5 and 6

Expected Output:
1
2
3
4
7
8
9
10
		 */
		
		for(int i= 1; i<=10; i++) {
			if ( i%6%5!=0) {
			System.out.println(i);
			}
		}

	}

}
