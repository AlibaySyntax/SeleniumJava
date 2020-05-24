package ReviewClass7;
public class Dermatologist extends Doctor {
	
String dermaID;
String name;
int salary;
String licenceID;
public Dermatologist(String name, String licenceID, int salary) {
super(name,licenceID,555);
this.dermaID=dermaID;

}
public void skinTest() {
System.out.println("let's sapply a some skin test");	
}
public void chargePatientt() {
System.out.println("let's me charge 200");
}}
