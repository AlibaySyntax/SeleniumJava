package syntax03DTypesINT;
import java.util.Scanner;
public class SwitchINT {
public static void main(String[] args) {
		Scanner scan;
		int num=0;
		String monthString;
    scan=new Scanner(System.in);
    System.out.println("The month you entred is month");
    num=scan.nextInt();
    monthString=scan.nextLine();
  
    switch(num) {
    case 1: 
    	System.out.println("January");
        break;
    case 2: 
    	monthString = "February";
    	System.out.println(""+monthString+"");
    	break;
    case 3: 
    	monthString = "March";
    	System.out.println(""+monthString+"");
        break;
    case 4: 
    	monthString = "April";
    	System.out.println(""+monthString+"");
    	break;
    case 5: 
    	monthString = "May";
    	System.out.println(""+monthString+"");
        break;
    case 6: 
    	monthString = "June";
    	System.out.println(""+monthString+"");
    	break;
    case 7: 
    	monthString = "July";
    	System.out.println(""+monthString+"");
        break;
    case 8: 
    	monthString = "August";
    	System.out.println(""+monthString+"");
    	break;
    case 9: 
    	monthString = "September";
    	System.out.println(""+monthString+"");
        break;
    case 10: 
    	monthString = "Octeber";
    	System.out.println(""+monthString+"");
    	break;
    case 12: 
    	monthString = "December";
    	System.out.println(""+monthString+"");
    	break;  
    	
	default: 
          System.out.println("Invalid");}}}

