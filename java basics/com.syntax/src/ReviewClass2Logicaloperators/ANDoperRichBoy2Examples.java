package ReviewClass2Logicaloperators;
import java.util.Scanner;
public class ANDoperRichBoy2Examples {
public static void main(String[] args) {
		
		 Scanner input=new Scanner(System.in);
		 System.out.println("Are you Boy or Girl?");
				
		 String boyGirl=input.next();
		 System.out.println("Are you rich true/false?");
		 boolean rich=input.nextBoolean(); 
		      
		 System.out.println("You are a "+boyGirl+ " and you are rich: "+rich);
		         //The 1 example
		 // if(!boyGirl.equals("boy")) {
			 //not boy	 
		 //}
		 //if(boyGirl.equals("girl")) {
			 //not boy
		 //} 
		 //if(rich) {
			 //only if rich  is true
		 //}
		 // if(!rich) {
			 //only rich is false
		 //}
		 //System.out.println("=============================================");
		         //The 2 example
		 if (boyGirl.equals("boy") && !rich) {
			 //only if is a boy and not rich
		System.out.println("only if is a boy and not rich");
		 }
		 if(!boyGirl.equals("boy") && rich) {
			 //only if it is not a boy and it is rich 
			 System.out.println("only if it is not a boy and it is rich ");
		 }
		 if(!(boyGirl.equals("boy")&& rich)) {
			//only if it is not (rich boy)
			 System.out.println("only if it is not (rich boy)");
		 
		 
		 

}}}
