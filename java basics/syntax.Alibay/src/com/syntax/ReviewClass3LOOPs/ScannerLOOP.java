package com.syntax.ReviewClass3LOOPs;
import java.util.Scanner;
public class ScannerLOOP {
public static void main(String[] args) {
//ask the user to enter a positive number and add it to the total
// He should enter -1 toSTOP. -1 will not be added to the total

	Scanner input=new Scanner(System.in);
	int total=0;
	int number = 0;
	       //1 way using WHILE
	 //System.out.println("Enter a number. To stop enter -1");
	 //number=input.nextInt();
	 
	 //while(number !=-1) {
		 //total += number;
	 
	 //System.out.println("Enter a number. To stop enter -1");
	 //number=input.nextInt();
     //}
     //System.out.println("The total is = "+total);
//}}
	       //2 way using DO-WHILE
	//do {
		//System.out.println("Enter a number. To stop enter -1");
		//number=input.nextInt();
	//if(number!=-1) {
		//total+=number;
	//}
	//}while (number!=-1);
	//System.out.println("The total number is = "+total);
//}}
          //3 way using FOR LOOP
	for (;number !=-1;) {
		System.out.println("Enter a number. To stop enter -1");
		number=input.nextInt();
		if(number!=-1) {
			total+=number;
	}
	}
	System.out.println("The total is = "+total);
}}
		