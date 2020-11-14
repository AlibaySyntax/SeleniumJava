package syntax30MAPs;
import java.util.*;
import java.util.Map.Entry;
public class EntrySet {
public static void main(String[] args) {
Map<String,String>land=new TreeMap<>	();
land.put("Togo","Lome");		
land.put("Jam","Tokio");
land.put("Japan","Iran");		
land.put("USA","NY");
land.put("Cuba","Havanna");		
land.put("Kazakhstan","Astana");
System.out.println(land);
//Storing  all entry obj get key and values
Set<Entry<String,String>>allEntries	=land.entrySet();
System.out.println(allEntries);
//loop through all enties to get K & V
for(Entry<String,String>entr:allEntries) {
	String key=entr.getKey();
	String value=entr.getValue();
	System.out.println(key.toUpperCase()+"--"+value.toLowerCase());
}
System.out.println("--iterate all entries to get K and V--");
Iterator<Entry<String,String>>entryIterator=allEntries.iterator();
while(entryIterator.hasNext()) {
Entry<String,String>e=entryIterator.next();
String key$value=e.getKey()+":::"+e.getValue();
System.out.println(key$value);
}
}}
