package Assignments;

public class Ass073 {

	public static void main(String[] args) {
		
		/*
		 * For you to do:
Write a program that creates an array of strings with the following 
values{"This", "is", "array", "of", "strings"} and prints all values in one line.

Output:
This is array of strings
		 */
		
		
		String[] word = {"This", "is", "array", "of", "strings"};
		int array1=word.length;
		for(int i=0; i<array1; i++) {
			System.out.print(word[i] + " ");
		}

	}

}
