package com.syntax.class06Switch;
import java.util.Scanner;
public class SCANNERandSWITCH2 {

	public static void main(String[] args) {
		/*Ask user a gender : M or F
		*based on the  gender will provide description*/
		
		 Scanner scan;
		 char gender;
		 String genderType;
		 
		 scan=new Scanner(System.in);
		 System.out.println("Olease enter gender: M or F");
		 gender=scan.next().charAt(0);
		
		  switch (gender) {
		  case 'M':
			  genderType="Male";
		      break;
		  case 'F':
			  genderType="Female";
			  break;
		 default:  
			 genderType="Unknown";  
		  }
		System.out.println("Your gender is: " +genderType);

	}

}
