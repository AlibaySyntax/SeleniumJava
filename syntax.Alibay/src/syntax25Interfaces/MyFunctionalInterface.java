package syntax25Interfaces;
//@FunctionalInterface
public interface MyFunctionalInterface {
    
public int addMethod(int a, int b);
public  class BeginnersBookClass {

public static void main(String args[]) {
        // lambda expression
MyFunctionalInterface sum = (a, b) -> a + b;
System.out.println("Result: "+sum.addMethod(12, 100));
}
}}




// OUTPUT: 112