package syntax05Scanner;

public class LogicalNot {

	public static void main(String[] args) {
		//not(!)-reverse the condition
		boolean b=!true;
		boolean val=!false;
		
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold = true;
		
		if(!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		String day1="Monday";
		
		
		//if it is not monday or friday --> find me at syntax
		
		if(!(day1.equals("Monday") && day1.equals("Friday"))) {
			System.out.println("find me at Syntax");
			//or if(!day1.equals("Monday") && !day1.equals("Friday"))
		}
		

	}

}
