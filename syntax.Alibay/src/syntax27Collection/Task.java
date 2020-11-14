package syntax27Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Task {
//Create an arraylist of cars and
//retrieve all the values using 3 defferent way.
//Create an array of words. 
//Remove every word than ends with "e". use Iterator
public static void main(String []args) {
ArrayList<String> greetings=new ArrayList<>();
greetings.add("Hello");
greetings.add("Merhada");
greetings.add("As-salam alaykum");
greetings.add("Hola");
greetings.add("Zdravstvuite");

Iterator<String> greeting2= greetings.iterator();
while(greeting2.hasNext()) {
if(greeting2.next().endsWith("a")) {
greeting2.remove();
}
}
System.out.println(greetings);
}
}
