package syntaxREPL;

import java.util.Scanner;

public class Test28RectangleSquare {

	public static void main(String[] args) {
		int length;
		int width;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the length ");
		int rectangle=input.nextInt();
		System.out.println("Please enter the width ");
		int object=input.nextInt();
		
		if(rectangle>object) {
		System.out.println("The shape of your object is rectangle");
	    }else if(rectangle==object){
	    System.out.println("The shape of your object is square");
		
	}}}


