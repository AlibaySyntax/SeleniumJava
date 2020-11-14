package syntax30MAPsKeyValueRem;

import java.util.HashMap;

public class MapReplace {
	// Main method 
    public static void main(String[] args) 
    { 
        // Create a HashMap and add some values 
        HashMap<String, Integer> map = new HashMap<>(); 
        map.put("a", 100); 
        map.put("b", 300); 
        map.put("c", 300); 
        map.put("d", 400); 
  
        // print map details 
        System.out.println("HashMap: "
                           + map.toString()); 
  
        // provide value for the key which has 
        // to replace it's current value, and will 
        // store the value in k using the 
        // replace(K key, V value) method 
        int k = map.replace("b", 200); 
  
        // print the value of k 
        System.out.println("Previous value of 'b': "
                           + k); 
  
        // print new mapping 
        System.out.println("New HashMap: "
                           + map.toString()); 
    } 
} 
