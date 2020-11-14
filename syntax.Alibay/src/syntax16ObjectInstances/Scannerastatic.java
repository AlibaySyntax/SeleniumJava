package syntax16ObjectInstances;
import java.util.Scanner;
public class Scannerastatic {

//Home Work-Task-1 on March 22, 2020
//Create a method createEmail(). 
//Based on provided users name, lastName and email type, 
//your method should return complete email Address. 
//johnsnow@gmail.com or johnsnow@yahoo.com*
static String createEmail() {
Scanner sc =new Scanner(System.in);
String firstName,lastName, emailType, createEmail;
System.out.println("Please enter your firstName: ");
firstName=sc.next();
System.out.println("Please enter your lastName: ");
lastName=sc.next();
System.out.println("Please enter your lastName: ");
emailType=sc.next();
sc.close();
createEmail=(firstName.concat(lastName)+"@".concat(emailType)+".com");
return createEmail;
}
public static void main(String[] args) {
String emailId=Scannerastatic.createEmail();
System.out.println("Your email ID :"+emailId+" is created.");
}}


