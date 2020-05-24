package Assignments;

public class Ass047 {

	public static void main(String[] args) {
		
		/*
		 * For you to do: 
Using while loop print numbers from 15 to 0

Example Output:
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
0
		 */
		
		int num = 15;
		while(num>=0) {
			System.out.println(num);
			num--;
		}
		System.out.println("------------");
		for(int i=15; i>=0; i--) {
	    	System.out.println(i);
		}
	}

}
