package com.syntax.syntax21THISs;
public class ProgrammingHW {
// Task1 -Create a class named 'Programming'.  
//While creating an object of the class, 
// if nothing is passed to it, then the message "I love programming languages" should be printed.  
// If some String is passed to it, then in place of "programming languages" the value variable should be printed.  
// Example, if we pass “Java", then “I love Java" should be printed. 
String str;  	
ProgrammingHW () {
System.out.println ("I love programming languages"); 
}
ProgrammingHW (String str) {
//this.str = str; 
System.out.println ("Java programming languages");
}
public static void main (String []  args) {
	// Task1 
	ProgrammingHW obj = new ProgrammingHW ();
	ProgrammingHW obj1 = new ProgrammingHW ("Java"); 
	// Task2 
	ProgrammingHW obj2 = new ProgrammingHW (); 
	obj2.mult (19.2, 20.2); 
	obj2.mult (12  , 32); 
	obj2.mult (25, 4);
	// Task 3 
	ProgrammingHW obj5 = new ProgrammingHW (); 
	obj5.display ("Sofiya", " 6th grader goes to"); 
	obj5.display ("students partcipated in the project from"," Framing ham High School. "); 
	obj5.display ("Jayden is "," a kindergartener. ");
}
private void display(String string, String string2) {
System.out.println(string+""+string2);
}
private void mult(double d, double e) {
System.out.println(+(d+e));
}
private void mult(int d,int e) {
System.out.println(+(d+e));	
}
}


	
	

