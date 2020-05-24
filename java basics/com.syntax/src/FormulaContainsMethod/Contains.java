package FormulaContainsMethod;
import java.io.*; 
import java.util.*;
public class Contains {
public static void main(String args[]) 
	    { 
	        // creating an empty LinkedList 
	        Collection<String> list = new LinkedList<String>(); 
	  
	        // use add() method to add elements in the list 
	        list.add("Alibay"); 
	        list.add("in"); 
	        list.add("America"); 
	  
	        // Output the present list 
	        System.out.println("The list is: " + list); 
	  
	        // Checking the presence of Geeks 
	        // using contains() method 
	        boolean result = list.contains("Alibay"); 
	  
	        // printing the result 
	        System.out.println("Is Alibay present in the List: "
	                           + result); 
	    }} 

