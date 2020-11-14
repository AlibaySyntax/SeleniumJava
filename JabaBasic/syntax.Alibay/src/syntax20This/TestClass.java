package syntax20This;
public class TestClass extends Employee {
public static void main(String[]args) {
	Employee emp=new Employee();
	emp.empNumber=101;
	emp.salary=9000;
	emp.getPaid();
	Employee.company="ABC";
	Employee.work();
	System.out.println("------");
	
	ProductOwner po= new ProductOwner();
	po.empNumber=123;
	po.salary=150000;
	ProductOwner.company="Syntax";
	po.ceremonies="Sprint Grooming,Sprint Planning, Sprint Demo,Daily StandUp";
	po.attendMitings();
	po.prioritizeBacklog();
	ProductOwner.work();
	Employee.work();
}
}
