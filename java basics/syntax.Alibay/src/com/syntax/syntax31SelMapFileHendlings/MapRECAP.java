package com.syntax.syntax31SelMapFileHendlings;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
import java.util.Map.Entry;
import java.util.*;

public class MapRECAP {

public static void main(String[] args) {	
//Let's createMap of countries with capitals		
Map<String,String> hmap = new HashMap<>();
hmap.put("USA ","Washington DC ");
hmap.put("Russia ","Moscow ");
hmap.put("France ","Paris ");
hmap.put("Tajikistan ","Dushanbe ");
hmap.put("Germany ","another value ");// Dublicate key,previous value will be ovverriten
hmap.put("Italy ",null );
hmap.put(null, "some value " );//duplicate previous value will be overwritten
System.out.println(hmap);
//How to get all keys from Map,keySet(),entrySet()

Set<String>keys=hmap.keySet();//use loop or iterator to iterate over keys
Iterator<String>it=keys.iterator();
while(it.hasNext());
System.out.println(it.next());

Set<Entry<String,String>>entries=hmap.entrySet();
Iterator<Entry<String,String>>iter=entries.iterator();
while(it.hasNext());
//String key=iter.next().getKey();
//System.out.println(it.next());
Entry<String,String>entry=iter.next();
String meEntry=entry.getKey()+"--"+entry.getValue();
System.out.println(meEntry);
//How to get only values from Map; values(); entrySet();
Collection<String>values=hmap.values();
it=values.iterator();
while(it.hasNext()) {
String key=iter.next().getKey();
System.out.println(key);
}
//First part of the code
createMap("City,", "Chantily");

//second part of the code
createMap("City,", "Washington DC");
//Let's create hashtable of countries with capital
Map<String,String>htable = new Hashtable<>();
htable.put("USA ","Washington DC ");
htable.put("Russia ","Moscow ");
htable.put("France ","Paris ");
htable.put("Tajikistan ","Dushanbe ");
//htable.put("Italy ",null );Cannot Store null values inside hashtable
//htable.put(null, "some value " );Cannot store null keys inside hashtable
System.out.println(htable);
}
public static Map<String,String> createMap(String key, String value){
Map map=new HashMap<>();
map.put(key, value);
return map;
}}

