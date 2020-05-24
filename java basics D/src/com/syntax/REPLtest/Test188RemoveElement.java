package REPLtest;
import java.util.*;
public class Test188RemoveElement {
public static void main(String[] args) {

		List<String> countries = new LinkedList<>();
		countries.remove("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.remove("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.remove("Azerbaijan");
		
	    System.out.println(countries);
	    
}	
}
