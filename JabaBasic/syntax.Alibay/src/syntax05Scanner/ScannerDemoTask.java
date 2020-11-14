package syntax05Scanner;
import java.util.Scanner;
public class ScannerDemoTask {

public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
System.out.println("Please enter your age: ");
int age=scan.nextInt();
System.out.println("The age is: "+age);

//===========Using height============================
// int height=scan.nextInt();
// System.out.println("The height is: "+height);

//    Output example.
// Please enter your age: 
// 20 150
// The age is: 20
// The height is: 150
//===================================================

if(age<=10) 
System.out.println("You're too young my brothe! ");
else if (age<=20)
System.out.println("You're growing body! ");
else if (age<=50)
System.out.println("You're the man! ");
else
System.out.println("Man, you're dying");
	
}}
