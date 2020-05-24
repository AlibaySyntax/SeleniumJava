package com.syntax.syntax28CollectionsIteratops;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//import com.syntax23.Car;
public class LinkedListDemo {
public static void main(String[]args, char[] str, String String) {
LinkedList<String>llist=new LinkedList<>();
llist.add("Yunus");//comes from collection
llist.add("0,Re");//comes from list
llist.add("Ravel");
llist.add("Farid");

int size=llist.size();
System.out.println(size);
//get all element 1 by 1 in 3 different ways

for(int x=0; x<=llist.size(); x++) {
System.out.println(llist.get(x));
}

for(String a:llist) {
System.out.println(a);
}

Iterator<String>it=llist.iterator();
while(it.hasNext()) {
String str1=it.next();
System.out.println(str1);	
}

//can we store objects of users defined classes
//List<Food> food=new LinkedList<>();
//food.add(new Salad("salad","Tomato and Cuumber",100, str));
//food.add(new Dessert("Chocolate","Kace and Mo",50));
//food.add(new Maindish("Pasta","Muhroom",30));

//for(Food f:food) {
//f.calories();
//f.foodType();
//f.ingrediens();
}
}
//}
