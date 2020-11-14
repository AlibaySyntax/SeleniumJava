package Review010CollectionsSetMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAPintro {

//                      MAP
// HashMap | LinkedHashMap | TreeMap | HashTable |
	

public static void main(String[] args) {

Map<Integer,String>	phoneBook = new HashMap<>();
phoneBook.put(123456789,"John Smith");
phoneBook.put(123456780,"James London");
phoneBook.put(123456700,"Rohani Smith");
phoneBook.put(123456000,"Donald Trump");
phoneBook.put(123450000,"Obama");
phoneBook.put(123400000,"Brad Pitt");

//It will override Rohani Smith
phoneBook.put(123000000,"Julia Roberts");

String name= phoneBook.get(123400000);
System.out.println(name+" is calling!");

String name2=phoneBook.get(5555);
System.out.println(name2+" is calling!");

boolean contains=phoneBook.containsKey(5555);
System.out.println("5555 is in the map: "+contains);

boolean contains2=phoneBook.containsValue("julia Roberts");
System.out.println("Julia Roberts is in my contact list: "+contains2);

// Will remove Trump from my list
System.out.println("---Remove only Trump-------");
phoneBook.remove(123456000);
System.out.println(phoneBook);
phoneBook.isEmpty();

//====================================================

// Let's get all the Keys and store in a SET
System.out.println("-----Get only keySet()------");
Set<Integer>keys=phoneBook.keySet();
Iterator<Integer>it=keys.iterator();
while(it.hasNext()) {
Integer key=it.next();
String value=phoneBook.get(key);
System.out.println(key+"->this->"+value);
}

// Let's get all the values and store them in a Collection
System.out.println("-----Get only values()--------");
Collection<String>values=phoneBook.values();
for(String value:values) {
System.out.println(value);
}

// Let's get all the entries and store them in SET
System.out.println("---entrySet()-----------------");
Set<Entry<Integer,String>>entries=phoneBook.entrySet();

for(Entry<Integer,String>entry:entries) {
//System.out.println(entry);
//Integer key=entry.getKey();
//String value=entry.getValue();
//System.out.println(key+" ---> "+value);

System.out.println(entry.getKey()+" ---> "+entry.getValue());
}

//2nd Way,using iterator 
System.out.println("-------Iterator--------");
Iterator<Entry<Integer,String>>entryIt=entries.iterator();
while(entryIt.hasNext()) {
Entry<Integer,String>entry=entryIt.next();
System.out.println(entry.getKey()+":"+entry.getValue());
}






}
}
