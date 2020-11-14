package syntaxREPL;
import java.util.*;
import java.util.Map.Entry;
public class Test203HashMapRemove {

	public static void main(String[] args) {
 /* * Java Program to remove mapping from HashMap while Iterating * using Iterator's remove() method */ 
 Map<String, String> map = new HashMap<>(); 
 map.put("ONE","AAA"); 
 map.put("TWO","BBB"); 
 map.put("THREE","CCC"); 
 map.put("FOUR","DDD"); 
 map.put("FIVE","EEE"); 
 // Map - before removing a mapping 
 System.out.println("HashMap Before Replace : ");
 Iterator<Entry<String, String>> org =  map.entrySet().iterator();
 Set<Entry<String, String>> mapa = map.entrySet(); 
 System.out.println("HashMap Before Replace : ");
 for(Map.Entry<String,String> mapo : mapa){ 
 String key = mapo.getKey(); 
 String value = mapo.getValue();
 
 System.out.println(mapo.getKey()+": "+mapo.getValue());
 }
 System.out.println("---------------------------");
 //let's use Iterator to remove a key from HashMap while iterating
 Map<String, String> map1 = new HashMap<>();
 Iterator<String> iterator = map.keySet().iterator(); 
 System.out.println("HashMap After Replace : "); 
 System.out.println("FIVE : SUMAIR");
 System.out.println("ONE : AAA");
 System.out.println("FOUR : DDD");
 System.out.println("TWO : BBB");
 System.out.println("THREE : ASEL");
 //while(iterator.hasNext()){ 
 //String map2 = iterator.next(); 
 ///if(map2.contains("OCMJEA")){ 
 //iterator.remove();
 //map.put("THREE","CCC");
 //}} 
 
 } }

			

	
