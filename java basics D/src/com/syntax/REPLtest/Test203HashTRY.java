package REPLtest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.print.DocFlavor.STRING;

public class Test203HashTRY {

	public static void main(String[] args) 
	{ 

	    // Create a HashMap and add some values 
	    HashMap<String, String> map = new HashMap<>(); 
	    map.put("ONE","AAA"); 
	    map.put("WTO","BBB"); 
	    map.put("THREE","CCC"); 
	    map.put("FOUR","DDD"); 
	    map.put("FIVE","EEE"); 

	    // print map details 
	    System.out.println("HashMap Before Replace : " +map.toString());
	    
        System.out.println("------------------------");
        Iterator<Entry<String, String>> org =  map.entrySet().iterator();
        Set<Entry<String, String>> mapa = map.entrySet();
        
	    // provide value for the key which has 
	    // to replace it's current value, 
	    // using replace(K key, V value) method 
	    map.replace("THREE", "ASEL"); 
        map.replace("FIVE","SUMAIR");
	    // print new mapping 
	    System.out.println("HashMap After Replace : " + map.toString()); 
	}}
	