package ReviewClass2Logicaloperators;
import java.util.Scanner;
public class SingleGuyScanner {
public static void main(String[] args) {
		//He want to marry if she beautiful or rich

	 Scanner input=new Scanner(System.in);
	 System.out.println("Hey girl");
	 System.out.println("Are you beautiful true/false?");
	 boolean beautiful=input.nextBoolean();		
	 
	 
	 System.out.println("Are you rich true/false?");
	 boolean rich=input.nextBoolean(); 
	      
	 if (beautiful || rich) {
		 System.out.println("The student will marry you!");
	 }else {
		 //only poor lady
		 System.out.println("Are you a good person true/false");
		 boolean good=input.nextBoolean();
		 if(good) {
		 System.out.println("i will give you a chance");
		 }else {
			 System.out.println("you are in a bad situation!");
		 }
	 }
}}
