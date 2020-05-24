package com.syntax.class04BooleanNested;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		int age = 26;
		
		if (age<18) {
			System.out.println("You are teenager, please dont work");
		}else {
			System.out.println("You are older than 18");
			
			if (age <64) {
				System.out.println("you are eligable to work");
			}else {
				System.out.println("enjoy your life");
			}
		}

	}

}
