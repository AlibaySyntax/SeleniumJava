package Review06Manipulation;
public class MathOperation {
//Can be accessed from enywhere	
public int add(int num1, int num2) {
int addition=num1 + num2;
return addition;
}

public void add2(int num1, int num2) {
int addition=num1 +num2;
System.out.println("Printing the result"+"inside the method " +addition);
}
//Can be accesed from inside packedge
int multiply (int num1, int num2) {
return num1*num2;
}
//Can be access only within within the Class
private void lsmth(){
}}
