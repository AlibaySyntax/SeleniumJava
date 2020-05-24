package com.syntax30MAP;
import java.util.*;
public class MapHWRecap {

public static void main(String[] args) {
//Duplecate keys & value	
Map<Integer,String>	 buld=new LinkedHashMap<>();
buld.put(1, "Google");
buld.put(2, "Syntax");
buld.put(3, "Google");
buld.put(4, "amazon");
buld.put(5, "HP");
buld.put(6, "MSFT");
buld.put(7, "Oracle");

System.out.println(buld.size());
System.out.println(buld);
//how to get all keys
Set<Integer> keys=buld.keySet();
System.out.println("-get keys using iterator---");
Iterator<Integer>keysIt=keys.iterator();
while(keysIt.hasNext()) {
int key=keysIt.next();
System.out.println("Key is "+key+"  its value"+buld);
System.out.println("--get keys using each loop--");
for(int k:keys) {
System.out.println("key from buiding map "+k+buld);
}
//how to get all values	
Iterable<String> values=buld.values();//Iterable=Colection

System.out.println("--get all val using for each--");
System.out.println();
//map.-->int
int i=buld.size();
System.out.println("Integer in map");
System.out.println();
}
Collection<String>values=buld.values();//Iterable=colection
for(String v:values) {
System.out.println("Value fom collection");
}
System.out.println("---all values using iterators--");
Iterator<String>valuesIt=values.iterator();
while(valuesIt.hasNext()) {
System.out.println("Map values: "+valuesIt.next());
}
}
}
