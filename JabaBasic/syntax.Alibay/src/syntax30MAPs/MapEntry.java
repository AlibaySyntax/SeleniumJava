package syntax30MAPs;
//import java.util.LinkedHashMap;
import java.util.*;
//import java.util.Map;
import java.util.Map.Entry;
//import java.util.Set;
public class MapEntry {
	
public static void main(String[] args) {
//Create a MAP will store month an days in a month	
Map <String,Integer>month=new LinkedHashMap<>();
month.put("January",31);
month.put("February",28);
month.put("March",31);
month.put("April",30);
System.out.println(month.size());//-->SIZE
System.out.println("======");

System.out.println(month.entrySet());//--->entrySet
System.out.println("======");

//get all entries a map
Set<Entry<String,Integer>> entries=month.entrySet();
//loop through all entry object
for(Entry e:entries) {
System.out.println(e.getKey()+":"+e.getValue());
}
System.out.println();
//Iterator<Entryall entry OBJECT
Iterator<Entry<String,Integer>>it=entries.iterator();
while(it.hasNext()) {
//System.out.println("Key + " +it.next().getKey()+ " value="+it.next().getValue());
Entry<String,Integer>entry=it.next();
System.out.println("Key "+entry.getKey()+"=="+entry.getValue());
}
}}
