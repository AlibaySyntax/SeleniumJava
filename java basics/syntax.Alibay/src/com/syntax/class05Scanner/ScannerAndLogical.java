package com.syntax.class05Scanner;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*
		 * you are salesman
		 * ask a user for how much his slaes are
		 * based on the amount 1-100-->comission 10%
		 * 100-200--> comission 20%
		 * 200-500--> comission 30%
		 * more 500--> commision 50%
		 */
		
		//1. declare all variables
		
	Scanner scan;
	double sales;
	double commission;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your sales amount");
	sales=scan.nextDouble();
	 if(sales>=1 && sales<=100) {
		 //give user 10% comission
		 System.out.println("Based on your sales your commision is =" + (sales*0.1));
		 
		 //commission=sales*0.10;
	 }else if (sales>100 && sales <=200) {
		 //give iser 20% commision
		 System.out.println("Based on your sales your commision is =" + (sales*0.2));
		 
		 //commission=sales*0.2;
		 
	 }else if(sales > 200 && sales <=500) {
		 //give user 30%
		 System.out.println("Based on your sales your commision is =" + (sales*0.3));
		 
		 //commission=sales*0.3;
		 
		
	 }else {
		 //commission=sales*0.5;
		 System.out.println("Based on your sales your commision is =" + (sales*0.5));
		 
	 }
	 //if commission is >100--> you are awesome seller
	 //commision dont have any value this why commission is error
	 //if(commission>100) {
		 //System.out.println("You are an awesome seller");
	 
	
	//code bellow looks cleaner
	 
	 if(sales>=1 && sales<=100) {
		 //give user 10% comission
	
		 
		commission=sales*0.10;
	 }else if (sales>100 && sales <=200) {
		 //give iser 20% commision
		 
		 commission=sales*0.2;
		 
	 }else if(sales > 200 && sales <=500) {
		 //give user 30% 
		 commission=sales*0.3;
		 
		
	 }else {
		 commission=sales*0.5;
		 System.out.println("Based on your sales your commision is =" + commission);
		 
	 }
	// if commision is >100 --> you are awesome seller
	 
	 if(commission>100) {
		 System.out.println("You are awesome seller");
	 }
	}

}
