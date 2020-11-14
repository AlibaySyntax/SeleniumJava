package Review01DataType;
import java.util.Scanner;
public class ScannerIFelse {
public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);

		System.out.println("Please enter you age: ");
		int age=scan.nextInt();
		System.out.println("The age is "+ age);
		
		//int height=scan.nextInt();
		//System.out.println("The height is: "+height);
		
		if (age<=10)
		System.out.println("You're too young my brother! ");
		else if(age<=20)
			System.out.println("You're groing body! ");
		else if (age<=50)
		    System.out.println("You're the man! ");
		else
			System.out.println("Man, you're dying! ");
		
		
}}
