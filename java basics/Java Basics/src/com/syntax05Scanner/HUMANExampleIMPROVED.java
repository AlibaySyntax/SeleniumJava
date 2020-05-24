package com.syntax05Scanner;
import java.util.Scanner;
public class HUMANExampleIMPROVED {

	public static void main(String[] args) {
		
		 /*Take age input from a user and then based on the age print output
		 *if age from 0-3 --> you are baby 
		 * if age 4-5 -->you are a kid
		 * if age  from 6-12 --> you are a child
		 * if age from 13-19 --> you are teenager
		 * if age from 20-64 --> you are an adult
		 * if age is more or equal to 65 --> you are a senior*/
		 //1.- let's declare all variable
		int age;
		Scanner scan;//to import we use mac: cmd+shift+0
				             //windows:ctrl+shift+0
		//2.Capture value
		scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
		//3. perform verification
		String human;
		
		
        if(age<3) {
        	human="baby";
		}else{if(age>=4 && age<=5) {
			human="kid";
		}else{if(age>=6 && age<=12) {
			human="child";
		}else{if(age>=13 && age<=19) {
			human="teenager";
		}else{if(age>=20 && age<=65) {
			human="adult";
		}else {
			human="senior";		  
		}
		System.out.println("You are "+human);
		 if (human.equals("teenager")) {
				  
		   System.out.println("Parents good luck");
		}}}}}}}
		
				

	


