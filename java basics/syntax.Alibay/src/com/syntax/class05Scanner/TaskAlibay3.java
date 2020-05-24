package com.syntax.class05Scanner;
import java.util.Scanner;
public class TaskAlibay3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the amount of loan do you want ?");
		
		int loan=input.nextInt();
		
		if(loan<=200000) {
		
		System.out.println("TD bank can provide you loan");
		
	}else  {
		
		System.out.println("Sorry we cant"); 
		}
	
	}}

