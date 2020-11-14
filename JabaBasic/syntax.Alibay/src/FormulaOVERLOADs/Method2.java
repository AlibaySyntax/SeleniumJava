package FormulaOVERLOADs;

public class Method2 {
static class Addition { 
void sum (int d, int e) {     //<--INT.... The first sum method receives two integer arguments
System.out.println(d+e);
} 
void sum (double a, double b) {    //<--- DOUBLE...second sum method receives two float arguments.
System.out.println(a+b);
}
void sum (float a,float b) {// <--- FLOAT
System.out.println(a*b);	
}

public static void main (String args []) {
Addition obj=new Addition ();
obj.sum (10, 20);    //<---INT.....
obj.sum (10.05, 15.20);   //<---DOUBLE
obj.sum (0.9 , 2.5);// <----FLOAT
}}

}
