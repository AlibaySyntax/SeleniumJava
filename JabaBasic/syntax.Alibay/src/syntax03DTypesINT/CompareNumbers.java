package syntax03DTypesINT;

public class CompareNumbers {

	public static void main(String[] args) {
		double numberOne =10;
		double numberTwo =10;
		
		if (numberOne>numberTwo) {
			System.out.println("Number oneis large than number 2");
			
		}else if (numberOne<numberTwo){
			System.out.println("Number one is smaller than number 2");
		}else  {
		
  System.out.println("-----------------");
  
  //declare variable for a day and then based on the value we will put
  //output
  
  int day=6;
  
  if (day==1) {
	  
	 System.out.println(" Itbis Monday, no class today");
  }else if(day==2) {
	System.out.println("It is Tuesday, we have SDLC Class"); 

  }else if (day==3) {
	  System.out.println("It is Wednesday, we have SDLC Class");
	  
  }else if (day==4) {
	  System.out.println(" It is Thursday, we have review class");
	  
  }else if (day==5) {
	  System.out.println(" It is Friday, we have no class");
	  
  }else if (day==6) {
	  System.out.println("It is Saturday, we have Java Class");
	  
  }else {
	  System.out.println("It is Sunday, we have Java Clas");
  }
	}

	}
	
}

