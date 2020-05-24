package ReviewClass7;
public class Doctor extends Object {
	
static String hospitalName;
String name;
String licenceID;
int salary;
String dermaID;
public Doctor() {
//super()	;
}
public Doctor(String name, String licenceID, int salary) {
//this.name=doctorName;

this.name=name;
this.licenceID=licenceID;
this.salary=salary;
}
public Doctor(String name, String licenceID, int salary,String address) {
	//this.name=doctorName;
this(name,licenceID,salary);
this.name=address;
}

public void checkUp() {
System.out.println("Doctor " +name+ "  has ordered blood test.");
}

public void treatPatient (String  patientName) {
System.out.println("Doctor " +this.name+ " gives patients "+patientName);
}

public static void chargePatient() {
System.out.println("Let me charge $100. ");

}

public void displayInfo() {
System.out.println("Doctor " +name
		+ " with licenceID, has a salary: $" +salary+ " works for " +hospitalName);
//}
//public void payBill() {
//System.out.println("Let me charge $100. ");	
this.chargePatient();

}}


	

