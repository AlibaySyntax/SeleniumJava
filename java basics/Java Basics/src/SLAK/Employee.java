package SLAK;

public class Employee {
			/* Create a Class called Employee: 
			 * Create three variables eID , salary and set the CEO to "Sumair" 
			 * Create two objects of the class Employee Set the value of eID, 
			 * salary for each of the objects Print out the eID , salary and CEO for
			 * each of the objects
			 */
				int eID;
				double salary;
				static String CEO="Sumair";
			public static void main(String[] args) {
				
				Employee employee1=new Employee();
				employee1.eID=60012;
				employee1.salary=110000;
				Employee employee2=new Employee();
				employee2.eID=60013;
				employee2.salary=130000;
				System.out.print("First employee ID is "+employee1.eID+
						" and his salary is "+employee1.salary+" ");
				System.out.println("and his CEO is "+Employee.CEO+".");
				System.out.print("Second employee ID is "+employee2.eID+
						" and her salary is "+employee2.salary+" ");
				System.out.println("and her CEO is "+Employee.CEO+".");
}}


