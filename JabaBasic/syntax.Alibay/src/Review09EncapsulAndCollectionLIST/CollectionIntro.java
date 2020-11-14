package Review09EncapsulAndCollectionLIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class CollectionIntro {

public static void main(String[] args) {
List<String>africa=new LinkedList<>();
africa.add("Tunisia");
africa.add("Morocco");
africa.add("Kenia");
africa.add("Algeria");
africa.add(2,"Egypt");
//============================================
System.out.println("---If Add All---");
// 1st Way
List<String>africa2=new ArrayList<String>(africa);// Icreated a filled list
System.out.println(africa2);
//============================================
List<String>africa3=new ArrayList<String>();//Icreated an empty list
africa3.addAll(africa);
System.out.println(africa3);
System.out.println(africa);
System.out.println("--List Way---");
//============================================
ArrayList<String> europe =new ArrayList<>(); // empty arraylist
ArrayList<String> asia = null; // Don't have an object yet

asia=new ArrayList<>();// I created a list, but it is empty!!!
boolean empty=asia.isEmpty();

System.out.println("Asia is empty: "+empty);

asia.add("China");
asia.add("Tajikistan");
asia.add("Japan");
asia.add("Turkey");
asia.add("China");
asia.add("Nepal");
System.out.println(asia);

System.out.println("----ArrayList Way----");
//============================================
System.out.println("Europe size is "+europe.size());
System.out.println("Europe is empty: "+europe.isEmpty());

europe.add("Albania");
europe.add("Frence");
europe.add("Germany");
europe.add("Spain");
europe.add("Portugal");
europe.add("Turkey");

europe.remove("Turkey");
System.out.println("Europe size is "+europe.size());
System.out.println(europe);

europe.remove("Turkey");

System.out.println("Europe size is "+europe.size());
System.out.println("Europe is empty: "+europe.isEmpty());

System.out.println("----Iterate/Loop----");

// 1st Way
for(int i=0; i<europe.size(); i++) {
String country=europe.get(i);
System.out.println(country+ " ");
}
System.out.println();

// 2nd Way
for(String country:europe) {
System.out.println(country+ " ");
}
// 3rd Way
Iterator<String>it=europe.iterator();
//it.next(); // Will return the next element from the collection
//it.hasNext(); // Will return true/false
//it.remove(); // Will remove the element while iterating
System.out.println("==Iterator Way========");
//==========================================
String country1=it.next();
String country2=it.next();
String country3=it.next();
String country4=it.next();
String country5=it.next();
if(it.hasNext()) { // this is a safe check
String country6=it.next();
}
System.out.println(country1+" "+country2+" "+country3);
Iterator<String>it2=europe.iterator();
while(it.hasNext()) {// As long as there is a next element. This will NOT move the cursor	
String country=it.next();// Get the next element. This will move the cursor
System.out.println(country + " ");
}
System.out.println();
}
}






