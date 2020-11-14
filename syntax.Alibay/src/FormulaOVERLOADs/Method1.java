package FormulaOVERLOADs;

public class Method1 {
static class Addition { 
	
void sum (int a, int b) {     // two numbers first sum method performs addition of two numbers
System.out.println(a+b); 
}  
void sum (int a, int b, int c) {   //second sum method performs addition of three numbers.   
System.out.println(a+b+c);   //three numbers
}
public static void main (String args []) { //Put STATIC
Addition obj=new Addition ();
obj.sum (10, 20);    //two numbers
obj.sum (10, 20, 30);    //three numbers
}}}
