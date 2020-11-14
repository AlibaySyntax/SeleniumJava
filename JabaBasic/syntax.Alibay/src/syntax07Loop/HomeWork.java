package syntax07Loop;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		Scanner scan;
		char operator;
		double num;
		double num1;
		double result=0.0;
		
		scan=new Scanner(System.in);
		System.out.println("====CALCULATOR===");
		System.out.println("Please enter two numbers & an arithmetic operator;");
		System.out.println("===============================");
		
		System.out.println("Number 1:");
		num=scan.nextInt();
		
		System.out.println("Choose from (+,-,* or /");
		operator=scan.next().charAt(0);
		
		System.out.println("Number 2:");
		num1=scan.nextInt();
		scan.close();
		
		switch(operator) {
		case '+':
			result = num +num1;
			break;
		case '-':
			result = num-num1;
			break;
		case '*':
			result = num * num1;
			break;
		case '/':
			result = num/num1;
			break;
			default:
				System.out.println("you have entered wrong operator");
				
				
		}
		//if result was not calculated i do not see below mess
		//if() result!=0.0
		System.out.println("your calculator is " + result);

	}

}
