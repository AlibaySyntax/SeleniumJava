package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=10;
		if (time<12) {
			System.out.println("Good morning");
		}
		System.out.println("---------WHILE LOOP--------");
		
		//while(time<12) {
		//	System.out.println("Good morning");//code will execute infinetely
			
		//}

	
	while(time<=12) {
		System.out.println("Good morning");
		time++;
	}
		System.out.println("------------------");
		//how to print number from 1 to 50?
		int num=1;
		while(num<=50) {
			System.out.println(num);
			num++;
		}
		System.out.println("-------------------");
		//how to print number from 20 to 30
		int num1=20;
		while(num1<=30) {
			System.out.println(num1);
			num1--;	
		}
		System.out.println("------------------");
		// how to print numbers from 5 to 15 all in one line
		int num2=5;
		while(num2<=15) {
			System.out.println(num2 + " ");
			num2++;
		}
		System.out.println("---------------");
		//how to print values from 10 to 17
		int num3 =10;
		
		while(num3>=1) {
			System.out.println(num3);
			num3--;
			
		}
	}

}
