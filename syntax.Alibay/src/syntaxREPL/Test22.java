package syntaxREPL;
import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {

	
Scanner scan=new Scanner(System.in);
String name="Weqas";
String mobile="571-339-9993";
int Age=45;

// Instruct user of what program expects
System.out.println("Enter your name");
String Weqas=scan.nextLine();           //capture line of String from a user

System.out.println("Enter your mobile number");
String number=scan.nextLine(); 

System.out.println("Enter your age");
int age= scan.nextInt(); 

 
System.out.println("Your name is "+name+", your age is "+Age+" and your mobile number is "+mobile+"");
}
}
