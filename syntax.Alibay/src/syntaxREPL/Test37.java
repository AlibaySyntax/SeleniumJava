package syntaxREPL;
import java.util.Scanner;
public class Test37 {

	public static void main(String[] args) {
			
     Scanner scan=new Scanner(System.in);
        boolean thirsty=true;
        boolean sleepy=false;

		System.out.println("Are you thirsty?");
		String thirsty1 = scan.nextLine();
		System.out.println("Are you sleepy?");
		String sleepy1=scan.nextLine();
			
		    if((thirsty) && !(sleepy)) {
		    }else {
			System.out.println("drink Wather");
		    }
			if((thirsty) && (sleepy)) {
		    }else {
			System.out.println("drink coffee");
		    }
			if((!(thirsty) && sleepy)) {
		    }else {
			System.out.println("drink tee");
			
}}}

