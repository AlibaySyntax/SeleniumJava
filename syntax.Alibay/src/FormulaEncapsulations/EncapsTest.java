package FormulaEncapsulations;

public class EncapsTest {

	
		 public static void main(String args[]){
	         EncapsulatonDemo obj = new EncapsulatonDemo();
	         obj.setEmpName("Mario");
	         obj.setEmpAge(32);
	         obj.setEmpSSN(212233);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getEmpSSN());
	         System.out.println("Employee Age: " + obj.getEmpAge());		

	}

}
