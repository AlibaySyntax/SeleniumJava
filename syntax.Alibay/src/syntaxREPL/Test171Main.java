package syntaxREPL;
import java.util.*;
public interface Test171Main {


public void addMethod(double firstNumber, double SecondNumder);
public void subMethod(double firstNumber, double SecondNumder);
public void multMethod(double firstNumber, double SecondNumder);
public void devMethod(double firstNumber, double SecondNumder);
}
 interface Functions  {
	 
	//static double firstnumber;
	//static double SecondNumder;
    static void add(double firstNumber, double SecondNumber) {
    return (a+b);
	}
	//@Override
	//public void sub(double firstNumber, double SecondNumder) {	
	//}
	//@Override
	//public void mult(double firstNumber, double SecondNumder) {	
	//}
	//@Override
	//public void dev(double firstNumber, double SecondNumder) {
	//}
	
public static void main(String[] args) {

	//Functions fun=new Functions ();
	//double firstNumber=100.00;
	//double SecondNumber=20.00;
	//System.out.println("Result is ::: "+ (firstNumber + SecondNumber));	
	//System.out.println("Result is ::: "+ (firstNumber - SecondNumder));	
	//System.out.println("Result is ::: "+ (firstNumber * SecondNumder));	
	//System.out.println("Result is ::: "+ (firstNumber / SecondNumder));
}
@Override
public default void addMethod(double firstNumber, double SecondNumder) {	
}
@Override
public default  void subMethod(double firstNumber, double SecondNumder) {	
}
@Override
public default void multMethod(double firstNumber, double SecondNumder) {	
}
@Override
public default void devMethod(double firstNumber, double SecondNumder) {

	Functions fun=new Test171Outputs ();
	double firstNumber1=100.00;
	double SecondNumber=20.00;
	System.out.println("Result is ::: "+ (firstNumber1 + SecondNumber));	
	System.out.println("Result is ::: "+ (firstNumber1 - SecondNumder));	
	System.out.println("Result is ::: "+ (firstNumber1 * SecondNumder));	
	System.out.println("Result is ::: "+ (firstNumber1 / SecondNumder));
}	
}
	