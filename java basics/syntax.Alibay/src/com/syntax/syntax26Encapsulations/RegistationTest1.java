package com.syntax.syntax26Encapsulations;
import java.util.Scanner; 
public class RegistationTest1 {
public static void main (String [] args) {
	
Scanner input = new Scanner (System.in);  
System.out.println("input mail address");  
String email = input.nextLine();  
System.out.println("input username"); 
String username =input.nextLine();  
System.out.println ("input password");   
String password =input.nextLine();

RegistrationEndsWITH user = new RegistrationEndsWITH ();  
user.setEmail (email);  
user.setUsername (username);  
user.setPassword (password);  
System.out.println ("Employee email is: "+ user.getEmail ());
System.out.println ("Employee username is: "+ user.getUsername ());
System.out.println ("Employee password is: "+  user.getPassword ());
}
}