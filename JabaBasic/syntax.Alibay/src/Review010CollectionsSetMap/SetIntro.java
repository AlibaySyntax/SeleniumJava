package Review010CollectionsSetMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIntro {

public static void main(String[] args) {
		
//                     Collection=Animal
//----------------------------------------------------------------------	
//      List=Mammal         ||             Set=birds                 ||  Qugue
//ArrayList  |  LinkedList	|| HashSet |  LinkedHashSet  |  TreeSet  ||
	
Set<String>africalinked=new LinkedHashSet<>();
africalinked.add("ATunisia");
africalinked.add("Morocco");
africalinked.add("Kenia");

// Will not add in the Set, because it already exists
africalinked.add("Kenia");// No exist is double

africalinked.add("Algeria");
// You cannot add with an index!!!
//africa.add(2,"Egypt");

System.out.println("LinkedHashSet "+africalinked);
//=============================================
Set<String>africa2=new HashSet<>(africalinked);
System.out.println("HashSet "+africa2);
//============================================
Set<String>africa3=new TreeSet<>(africalinked);
System.out.println("TreeSet "+africa3);

int size=africa2.size();
boolean contains=africa2.contains("Kenya");
boolean isEmpty=africa2.isEmpty();
boolean ableToRemove=africa2.remove("Algeria");

//--> You are NOT able to remove by index africa2.get(2);
//--> 1st way, Does NOT work in a SET (bellow)....

// for (int i=0; i<africa2.size(); i++){
// String country=africa2.get(i);
// System.out.println(country+ " ");
// }

// 2nd Way,enhanced/advanced for LOOP
System.out.println("---enhanced/advanced for loop---");
for(String country:africa2) {
System.out.println(country + " ");
}

// 3rd Way, using ITERATOR
System.out.println("--using iterator--");
Iterator<String> it=africa2.iterator();
while (it.hasNext()) {
String country=it.next();
System.out.println(country = " ");
}
// 1.LIST reserves insertion order, BUT SET dosen't
// 2.LIST contains duplicates, BUT SET contains unique objects
Set<String>europe=new HashSet<>();
europe.add("Albania");
europe.add("Frence");
europe.add(null);
europe.add("Spain");
europe.add("Portugal");
europe.add("Spain");
europe.add(null);

System.out.println(europe);

// Collection Framework
// Collection Interface
// Collections is a class
String minimum=Collections.min(africa2);
System.out.println(minimum);

Set<Object> numbers=new HashSet<>();
numbers.add("abc");
numbers.add(true);
numbers.add(56);
numbers.add(23);
numbers.add(49);
numbers.add(93);
numbers.add(17);


// for(Object obj:numbers) {
// System.out.println(obj);
// }


//=============The Method Temprorery no Working=====================
// Integer minInt = Collections.min(numbers);
// Integer maxInt = Collections.max(numbers);
// System.out.println("Numbers from "+minInt+ "to " +maxInt);

}
}
