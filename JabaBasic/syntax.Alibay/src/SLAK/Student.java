package SLAK;

public class Student {
			/* Create a Class called Students 
			 * Create three variables studentName , studentID and numberOfStudents
			 * Create three objects of the Students Class Set the value
			 * for studentName , studentID and increment the numberOfStudents for each
			 * object Print out total number of students
			 */
			String studentName;
			int studentID;
			static int numberOfStudents;
			public static void main(String[] args) {
				Student student1=new Student();
				student1.studentName="Ilkhomdzhon";
				student1.studentID=10001;
				student1.numberOfStudents++;
				
				Student student2=new Student();
				student2.studentName="Umedzhon Kasymov";
				student2.studentID=10002;
				student2.numberOfStudents++;
				
				Student student3=new Student();
				student3.studentName="Anshumann Sharma";
				student3.studentID=10003;
				student3.numberOfStudents++;
				System.out.println("Total number of students = "+Student.numberOfStudents);
}}		

