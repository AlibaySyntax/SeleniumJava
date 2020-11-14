package Selen04WebElementComands;
import java.util.ArrayList;
//import java.util.*;
import java.util.List;

public class ListDemo {

public static void main(String[] args) {
	
ListDemo d=new ListDemo();
List<String>list=d.finedElement();
for (int i=0; i<list.size(); i++) {
String text=list.get(i);
if(text.equals("bye"));
System.out.println(text);
	
}
}		
public List<String> finedElement() {
ArrayList<String>list=new ArrayList<>();
list.add("Hello");
list.add("bye");
list.add("Hello");
return list;

	
}
}


