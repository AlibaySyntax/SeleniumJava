package com.syntax.syntaxREPL;

public class Test210Exception {

	
		public Test210Exception(String s) {

		super();
		}
		//}
		//public class Grade{

		public static void main(String args[], Object e) throws Exception {

		int id;
		int grade;

		String grades = new String();{

		try{

		id = 123;

		System.out.println("Student id number: " + id);

		System.out.println("Enter the grade for the above student id number.");

		grade = (char)System.in.read();

		grades = String.valueOf((char)grade);

		if (grade <90) {
			System.out.println("You are an exceptionally awesome student");
		}else if(grade >90){
			System.out.println("throw");
			
		//}
//		if(grade != 'A' && grade != 'B' && grade != 'C' &&
//
//		grade != 'D' && grade != 'F'&& grade !='I')

		throw (new Exception(grades));

		System.out.println("SyntaxStudentException: ");

		System.out.println(" " + id + " " + (char)grade);

		}
		}
		catch(Exception e)

		{

		System.out.println("Invalid grade - " + e.getMessage());

		}

		}

		}		

	}


