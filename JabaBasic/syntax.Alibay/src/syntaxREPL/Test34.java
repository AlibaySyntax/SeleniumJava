package syntaxREPL;

import java.util.Scanner;

public class Test34 {

	public static void main(String[] args) {
	

	       Scanner input= new Scanner(System.in);
	       System.out.println("Enter any tree numbers");
	       
	        int num1=input.nextInt();
	        int num2=input.nextInt();
	        int num3=input.nextInt();
	        int Largest;
	      
	            if (num1>num2) {
	            if (num1>num3) {
	               Largest=num1; 
	            }else {	
	               Largest=num3; 
	            }
	            }else {
	            if(num2>num3) {
	               Largest=num2;
	            }else {
	               Largest=num3;       
}}  
	            System.out.println("Largset number is: " +Largest);
	            
}}
	


