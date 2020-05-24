package MAP;

import java.util.HashMap;
import java.util.*;

public class MAP1 {
	

		public static void main(String[] args, String key) {
			
		//Lets create a grocery Map(item,quantity)which we		
		Map<String,Integer>groc=new HashMap<>();
		groc.put("milk,",1);
		groc.put("cucumber",3);
		groc.put("banana,",12);
		groc.put("cheese,",2);
		groc.put("grapes,",2);
		
		System.out.println(groc);
}}
