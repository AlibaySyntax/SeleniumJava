package syntax22Overloads;
public class EmployeeTest {

public static void main(String[] args, String hourlyRate) {
		
Employee emp=new Employee() ;
emp.salary=80000;
emp.getPaid();

FullTimeEmployee ft=new FullTimeEmployee();
ft.salary=90000;
ft.getPaid();
 
Contractor ct=new Contractor() ;
	ct.hourlyRate=50;
	ct.getPaid();
System.out.println("Contractor get's paid " +hourlyRate);
}}



