package com.syntax.class05Scanner;

import java.util.Scanner;

public class LogOperAge {
	
	public static void main(String[] args) {
	
		Scanner Alibay = new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age = Alibay.nextInt();
		
	if (age>0) {
		
	if(age>0 && age<=3) {
		System.out.println("You are a baby");
	}else if(age>3 && age<=5) {
		System.out.println("You are kid");
	}else if (age>6 && age<=12) {
		System.out.println("You rae a child");
	}else if (age>13 && age<=19) {
		System.out.println("You are a teen");
	}else if (age >20 && age<=64) {
		System.out.println("You are adult");
	}else if (age>65) {
		System.out.println("You are a senior");
	}
}else {
		System.out.println("Enjoy your life");

}
}

}
