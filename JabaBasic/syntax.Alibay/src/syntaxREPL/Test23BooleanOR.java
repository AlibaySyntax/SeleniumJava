package syntaxREPL;

import java.util.Scanner;

public class Test23BooleanOR {

public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
//System.out.println("Input the boolean value"); 
//System.out.println();
boolean isTrue=true;
boolean isFalse=true;

if(isTrue || !isFalse) {
System.out.println("Input the boolean value");	
System.out.println("The value is true");

System.out.println();

if(!isTrue || isFalse){
System.out.println("Input the boolean value");	
System.out.println("The value is false");
}
}}}
