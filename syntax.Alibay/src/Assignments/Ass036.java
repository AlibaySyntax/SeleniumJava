package Assignments;

import java.util.Scanner;

public class Ass036 {

	public static void main(String[] args) {
		
		/*
		 * For you to do:
Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"

Example input/output:
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND

word1: banana 
word2: apple 
int1: 2 
int2: 2 
Output: OR

word1: phone
word2: pie
int1: 2
int2: 3
Output: NONE
		 */
		
		Scanner variable = new Scanner(System.in);
				
				System.out.println("Please enter two strings");
				String text = variable.nextLine();
				
				System.out.println("Please enter two strings");
				String text1= variable.next();
				
				System.out.println(text);
				System.out.println(text1);
				
				variable.nextLine();
				System.out.println("Please enter two numbers");
				int num=variable.nextInt();
				
				System.out.println("Please enter two numbers");
				int num1 = variable.nextInt();
				if (num==num1 && text==text1) {
				    System.out.println("AND");
				} if (num==num1 || text==text1){
				    System.out.println("OR");
				} if (num!=num1 && text!=text1) {
					System.out.println("None");
				}
				

			}

		}
