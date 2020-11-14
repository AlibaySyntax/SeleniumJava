package syntax06Switch;
import java.util.Scanner;
public class ScannerStringOR {

	public static void main(String[] args) {
		
	        Scanner scan=new Scanner(System.in);
		
		    System.out.println("Enter your birth month");
		    String month=scan.nextLine();
		    
		    String season=null;
		
		              if ((month.equals("January")) || (month.equals("February")) || (month.equals("March"))) {
		                   season="Winter";
		              }else if ((month.equals("April")) || (month.equals("May")) || (month.equals("June"))) {
	                       season="Autumn";
		              }else if ((month.equals("July")) || (month.equals("august")) || (month.equals("September"))) {
		                   season="Sammer";
		              }else if ((month.equals("October")) || (month.equals("November")) || (month.equals("December"))) {
		                   season="Spring";
		              }else  {
		            	   season="UNKNOWN";
		            		  }
		                       System.out.println("Where You birn in: " +season+ ".");}
		
		
	}


