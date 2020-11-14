package syntax30MAPsKeyValueRem;
import java.util.*; 
public class MAPreplace1 {
	 
    // Main method 
    public static void main(String[] args) 
    { 
        // Create a HashMap and add some values 
        HashMap<String, Integer> map 
            = new HashMap<>(); 
        map.put("a", 100); 
        map.put("b", 300); 
        map.put("c", 300); 
        map.put("d", 400); 
  
        // print map details 
        System.out.println("HashMap: "
                           + map.toString()); 
  
        // provide value for the key which is 
        // not mapped previously and store the 
        // return value in Integer k, using 
        // replace(K key, V value) method 
        Integer k = map.replace("e", 200); 
  
        // print the value of k 
        System.out.println("Value of k, returned "
                           + "for key 'e': " + k); 
  
        // print new mapping 
        System.out.println("New HashMap: "
                           + map.toString()); 
    } 
} 


