package Review01DataType;
public class IfelseDemo {
public static void main(String[] args) {
	
	// Is Ali tired
	boolean tired=true;
	
	if (tired) { //true
		System.out.println("Go to sleep! ");//true
		System.out.println("Don't forget to wake up! ");
		
	}else {//false
		System.out.println("Study more! ");//false
		System.out.println("Continue studing ");
	}
	
	//========================Other Ways===============================
	
	System.out.println("------Other Ways-------");
	
	System.out.println("Let's print the bigger number: ");
	int number1=14;
	int number2=10;
	
	if(number1>number2) {
	    System.out.println("number1 is bigger, the value is "+number1);
		
	}else if(number2>number1){
	    System.out.println("number2 is bigger, the value is "+number2);
		
	}else {
	    System.out.println("number1 and number2 are equal, the value is "+number2);
	}

//	System.out.println("Let's do it Baramgul's way");
//	if(number1>number2) {
//		System.out.println("number1 is bigger, the value is "+number1);
//			
//	if(number2>number1){
//		System.out.println("number2 is bigger, the value is "+number2);
//			
//	}else {
//		System.out.println("number1 and number2 are equal, the value is "+number1);
	
	
	
}}
//Ask for the age. Use Scanner
//if it is less than 10, print you're too young
//if it is less than 20, print you're growing
