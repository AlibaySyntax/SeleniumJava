package ReviewClass2Logicaloperators;
import java.util.Scanner; 
public class Class2NestedIfrichBoy {
public static void main(String[]ares) {
	
 Scanner input=new Scanner(System.in);
 System.out.println("Are you Boy or Girl?");
		
 String boyGirl=input.next();
 System.out.println("Are you rich true/false?");
 boolean rich=input.nextBoolean(); 
      
 System.out.println("You are a "+boyGirl+ "and you are rich:"+rich);
 if (boyGirl.equals("boy")) {
	 //boy
	 System.out.println("Yaaaay");
	 if(rich) {
	 //rich boy
	 System.out.println("Buy a ferrari");
	 }else {
		 //poor boy
		 System.out.println("Play sports");
 }
 }else if(boyGirl.equals("girl")) {
	 //girl
	 System.out.println("Yay");
	 if(rich) {
	 //rich girl
	System.out.println("Buy louis Vuiton");
 }else {
	 //if poor girl
	 System.out.println("read book");}	 
 }else {
	 //neither boy or girl
	 System.out.println("You entered wrrrong choice");
 }
	 System.out.println("You are done");
}}


