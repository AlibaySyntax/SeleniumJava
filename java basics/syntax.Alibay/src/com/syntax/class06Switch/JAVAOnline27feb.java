package com.syntax.class06Switch;
import java.util.Scanner;
public class JAVAOnline27feb {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Are you a boy or a girl?");
		String boyGirl =input.next();
		
		System.out.println("Are you rich true/false?");
		boolean rich = input.nextBoolean();
		
		System.out.println("You are a "+rich+" and you are " +rich);
		
		if (boyGirl.equals("girl")) {
			//boy
			System.out.println("YaaaaaaY");
			 //(rich)
			if (rich) {
			System.out.println("I will buy Ferrary");
			}else {
				System.out.println("Play sport");}
			}else if (boyGirl.equals("Girl")) {
				System.out.println("YaaY");
				if (rich) {
					System.out.println("I will Luis Vuitton");
				}else {
					System.out.println("I will socks Dick");
				}
				}else { 
					System.out.println("You entered a wrrong choice.");
			}
		System.out.println("We are done.");
			
			
}}


