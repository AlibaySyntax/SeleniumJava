package FormulaGetMethod;
import java.util.*; 
public class getMethod {
	// Java program to demonstrate getMethod() method 
	  
	
	  
	//public class Test() {}
public void func() {} 
public static void main(String[] args) 
throws ClassNotFoundException, NoSuchMethodException { 
// returns the Class object for this class
	
Class myClass = Class.forName("Test"); 
System.out.println("Class represented by myClass: "
+ myClass.toString()); 
String methodName = "func"; 
Class[] parameterType = null; 
// Get the method of myClass 
// using getMethod() method 

System.out.println( 
methodName + " Method of myClass: "
+ myClass.getMethod(methodName, parameterType)); 
} 
} 

