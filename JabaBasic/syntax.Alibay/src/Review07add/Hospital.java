package Review07add;
public class Hospital {
public static void main(String[] args) {

Doctor doc1=new Doctor("John Smith","12345",150000) ;
//doc1.name="John Smith";
//doc1.LicenceID="12345";
//doc1.salary=150000;
	
System.out.println("Doctor's name is John Smith ");
doc1.displayInfo();
//doc1.chargePatient();
doc1.treatPatient("Adam Smith");

}}
