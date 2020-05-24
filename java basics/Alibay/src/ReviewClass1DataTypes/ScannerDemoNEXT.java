package ReviewClass1DataTypes;
import java.util.Scanner;
public class ScannerDemoNEXT {
public static void main(String[] args) {
	//Ask for the age. Use Scanner
	//if it is less than 10, print you're too young
	//if it is less than 20, print you're growing
	Scanner input=new Scanner(System.in);
	
	String firstLine=input.nextLine();
	System.out.println("firstLine was: "+firstLine);
	
	String secondLine=input.next();
	System.out.println("secondLine was: "+secondLine);
	
	String thirdLine=input.next();
	System.out.println("thirdLine was: "+thirdLine);

}}
