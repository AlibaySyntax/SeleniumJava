package syntax30MAPsKeyValueRem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapRemove {
public static void main(String[] args) { 
	        // Create a HashMap 
	        HashMap<Integer, String> 
	            map = new HashMap<>(); 
	        // Populate the HashMap 
	        map.put(1, "Geeks"); 
	        map.put(2, "ForGeeksss"); 
	        map.put(3, "GeeksForGeeks"); 
	        // Get the value to be removed 
	        String valueToBeRemoved = "ForGeeks"; 
	        // Print the initial HashMap 
	        System.out.println("Original HashMap: " + map); 
	        // Get the iterator over the HashMap 
	        Iterator<Map.Entry<Integer, String> > 
	            iterator = map.entrySet().iterator(); 
	        // Iterate over the HashMap 
	        while (iterator.hasNext()) { 
	            // Get the entry at this iteration 
	        Map.Entry<Integer, String> entry = iterator.next(); 
	            // Check if this value is the required value 
	            if (valueToBeRemoved.equals(entry.getValue())) { 
	                // Remove this entry from HashMap 
	                iterator.remove(); 
} } 
	  
	        // Print the modified HashMap 
	        System.out.println("Modified HashMap: " + map); 
}} 
