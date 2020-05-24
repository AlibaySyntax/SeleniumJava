package com.syntax30MAP;
import java.util.*;

public class AllMaps {

public static void main(String[] args, String key) {
	
//Lets create a grocery Map(item,quantity)which we		
Map<String,Integer>grocery=new HashMap<>();
grocery.put("milk,",1);
grocery.put("cucumber",3);
grocery.put("banana,",12);
grocery.put("cheese,",2);
grocery.put("grapes,",2);
System.out.println(grocery);

//Create a map of buy(item,quantity)
Map<String,Integer> househ=new LinkedHashMap<>();
househ.put("Lisol",2);
househ.put("Lisol",2);
househ.put("Lisol",3);
househ.put("Lisol",10);
househ.put("Lisol",50);
System.out.println(househ);

//Create a map in which we store all previous item
Map<String,Integer> shopping=new TreeMap<>(grocery);
shopping.putAll(househ);
System.out.println(shopping);
//get all keys
for (String Key:shopping.keySet()) {
System.out.println("Key: "+Key);
}

// all keys using iterator
Iterator<String>It=shopping.keySet().iterator();
while(It.hasNext()) {
System.out.println("Key="+It.next());
}

//Loop
System.out.println("--loop---");
for(int val:shopping.values()) {
System.out.println("Value:"+val);	
}

//value all Iterator
Iterator<Integer>iterator=shopping.values().iterator();
System.out.println("value= "+iterator.next());
}}
