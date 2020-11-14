package syntax27Collection;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListRecap {

public static void main(String[] args) {
//lets arraylist that stores double type of object		
//1.generic colection/arraylist
ArrayList<Double>alist=new ArrayList<>();
alist.add(10.99);
alist.add(12.99);
alist.add(100.99);
//alist.add(100)
//alist.add("Hello");
System.out.println(alist);
//replace element
alist.set(1,13.99);
System.out.println(alist);

//remove element
alist.remove(13.99);
System.out.println(alist.get(1));
//retrieve all element from collection
//1. use advanced/enhanced for loop
for(double a:alist) {
System.out.println(a);
}
//2. for loop
for(int i=0;i<alist.size(); i++) {
double d=alist.get(i);
System.out.println(d);
}
//3.Iterator
Iterator<Double>iterator=alist.iterator();
while(iterator.hasNext()){
double d=iterator.next();
System.out.println(d);
}
System.out.println("----none generetic colloection--");

//2.non generetic/arraylist
ArrayList obj=new ArrayList();
obj.add("Hello");
obj.add(100);
obj.add('C');
obj.addAll(alist);//store collection object
System.out.println(obj);
//retrieve all element from collection
for(Object o:obj) {
System.out.println(o);
}}}



