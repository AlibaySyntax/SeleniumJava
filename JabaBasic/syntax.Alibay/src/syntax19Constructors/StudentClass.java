package syntax19Constructors;
public class StudentClass {

static String name;
String address;
String state, stateCapital;
public StudentClass(String name, String address) {
this.name=name;
this.address=address;
}
public void screenname() {
System.out.println(name);
}
public void displayaddress() {
System.out.println(address);
}
//Can I call 1method another method? -->YES
public void displayInfo() {
//this.displayState();do not use this value	
screenname();//by default compiler add this keyword to a method
displayaddress();
}

public static void main(String[]args) {
//StudentClass state1=new StudentClass("Alibay","Charleston city");
//state1.screenState();
//state1.displayCapital();
StudentClass name1 = new StudentClass("student Alibay living in the: ","Charleston city.");
name1.displayInfo();
}}
