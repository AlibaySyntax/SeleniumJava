package com.syntax.syntax08Loops;
import java.util.Scanner;
public class TASK2LOOPwithBREAK {
public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
for(int i=1; i<=10; i++) {
System.out.println("Do you want to apply for credit card?");
String creditCard=scan.next();
	
if(creditCard.equals("yes")) {
System.out.println("Congragulations!");
break;	

}else if(creditCard.equals("no")) {{
System.out.println("Sorry, see yo next time!!!");
	
System.out.println("Good luck");
break;
		
}
	}}}}

