package SLAK;
import java.util.Scanner;
public class Email {	
public String num(String Fname, String Lname, String emailtype) {
		        String h= Fname+Lname+emailtype;
		        return h;
		    }
public static void main(String[] args) {
	
		        Scanner scan=new Scanner(System.in);
		        System.out.println("Pleas enter your first name");
		        String Fname=scan.nextLine();
		        
		        System.out.println("Pleas enter your last name");
		        String Lname=scan.nextLine();
		        
		        System.out.println("Pleas enter your email type: @gmail.com || @yahoo.com ");
		        String emailtype=scan.nextLine();
		                
		        Email obj=new Email();
		        String x=obj.num(Fname,Lname,emailtype);
		        System.out.println(x);  
		//Pleas enter your first name
		//john
		//Pleas enter your last name
		//snow
		//Pleas enter your email type: @gmail.com || @yahoo.com 
		//@gmail.com
		//johnsnow@gmail.com
		//Collapse
}}
