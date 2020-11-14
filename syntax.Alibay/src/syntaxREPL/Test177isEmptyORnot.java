package syntaxREPL;
import java.util.ArrayList;

public class Test177isEmptyORnot {
public static void main(String[] args) {

ArrayList<Integer> arr = new ArrayList<Integer>(10);  //---> creating an Empty Integer ArrayList  
boolean ans = arr.isEmpty();                          //----> check if the list is empty or not using function
if (ans == true) 
System.out.println("true"); 
else
System.out.println("The ArrayList is not empty"); 

arr.add(1);//--->   addition of a element to the ArrayList 

ans = arr.isEmpty();//----->     check if the list is empty or not  
if (ans == true) 
System.out.println("The ArrayList is empty"); 
else
System.out.println("false"); 
} 
} 

