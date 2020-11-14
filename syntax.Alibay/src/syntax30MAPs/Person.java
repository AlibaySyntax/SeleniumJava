package syntax30MAPs;
		import java.util.*;
		import java.util.Map.*;
		public class Person {
		/* Home Work-April-19-2020
		Create a Person class with following private fields: name, lastName, age, salary. 
		Variables should be initialized through constructor.
		Inside the class also create a method to print user details.
		In Test Class create a Map that will store key in ascending order. 
		In that map store personId and a Person Object. Print each object details.
		*/
		//public class Person {
			String firstName, lastName;
			int age;
			double salary;
			Person(String firstName, String lastName, int age, double salary) {
				this.firstName = firstName;
				this.lastName = lastName;
				this.age = age;
				this.salary = salary;
			}
			public void userDetails() {
				System.out.println("Employee Name: " + firstName + "\t" + lastName + "\tAge: " + age + " and Salary = " + salary);
			}
			public static void main(String[] args) {
				Person emp1 = new Person("John", "Smith", 35, 80000.0);
				Person emp2 = new Person("Sara", "Smith", 34, 85000.0);
				Person emp3 = new Person("Ahmet", "H.", 37, 110000.0);
				Person emp4 = new Person("Faisal", "Sakhi", 34, 100000.0);
				Person emp5 = new Person("Ansh.", "Sharma", 50, 99000.0);
				Person emp6 = new Person("Prince", "Tetteh", 40, 95000.0);
				Person emp7 = new Person("Ahmad", "Salih", 37, 99000.0);
				Person[] arr = { emp1, emp2, emp3, emp4, emp5, emp6, emp7 };
				Random personId=new Random();
				Integer i=personId.nextInt(7001);
				Map<Integer, Person> employee = new LinkedHashMap<>();
				for (Person p : arr) {
					employee.put(i, p);
					i++;
				}
				System.out.println("===Printing Employee Details======");
				Set<Entry<Integer, Person>> emp = employee.entrySet();
				for(Entry<Integer, Person> e:emp) {
					System.out.print("EmployeeID: "+e.getKey()+" ");
					e.getValue().userDetails();
				}
				System.out.println("===Using iterator==============");
				Iterator<Entry<Integer, Person>> it = emp.iterator();
				while (it.hasNext()) {
					Entry<Integer, Person> p = it.next();
					System.out.print("Employee ID: "+p.getKey()+" ");
					p.getValue().userDetails();
				}
			}
		

	}


