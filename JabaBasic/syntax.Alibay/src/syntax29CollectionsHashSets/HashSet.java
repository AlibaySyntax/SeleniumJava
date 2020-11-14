package syntax29CollectionsHashSets;
import java.util.*;
public class HashSet {
public static void main(String []arg) {	


		
	
      // HashSet declaration
      HashSet hset = new HashSet();
     
      // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      
      //Addition of duplicate elements
      hset.add("Apple");
      hset.add("Mango");
      
      //Addition of null values
      hset.add(null);
      hset.add(null);

      //Displaying HashSet elements
      System.out.println(hset);
    }	
}


