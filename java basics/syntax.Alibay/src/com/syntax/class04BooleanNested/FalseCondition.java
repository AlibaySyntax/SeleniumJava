package com.syntax.class04BooleanNested;

public class FalseCondition {

	public static void main(String[] args) {
		
		boolean classToday=false;
		boolean flag = true;
		
		if (flag){
			System.out.println("Hello");
			
			if (classToday) {
				
				System.out.println("Hello friends");
			}
			
			
		}else {
			
			System.out.println("Bye");
		}

	}

}
