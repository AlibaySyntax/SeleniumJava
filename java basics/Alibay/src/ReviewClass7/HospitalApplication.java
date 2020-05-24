package ReviewClass7;
public class HospitalApplication {
	
public static void main(String[] args) {
Doctor.hospitalName="NJ Hospital";
//Doctor.hospitalName="NY Hospital";
//Doctor.payBills();
Doctor.chargePatient();
Doctor doctor1;

doctor1=new Doctor("John Smith","12345",150000) ;
	//doc1.name="John Smith";
	//doc1.LicenceID="12345";
	//doc1.salary=150000;
		
System.out.println("Doctor's name is John Smith ");
doctor1.displayInfo();
	//doc1.chargePatient();
doctor1.treatPatient("Adam Smith");

Doctor doctor2=new Doctor("Johnny Bianchi","33345",400000);	
doctor2.displayInfo();

Doctor doctor3=new Doctor("Mary  Bich","55545",500000);	
doctor3.displayInfo();

//Dermatologist derma = new Dermatologist() {
//derma.displayInfo();

//dermatologist1.displayInfo(){
//dermatologist1.name="Van David";
//dermatologist1.licenceID="555667";
//dermatologist1.salary=200000;
//dermatologist1.dermaID="555";
}}


