package com.syntax.syntax15ExceptionHandlingAndFuncDevs;

class BalanceException extends RuntimeException{
public BalanceException (){ 
	
}
}
public class ThrowKeyword {
//class BalanceException extends RuntimeException{

public static void main(String[] args) {
NullPointerException npe=new NullPointerException();
//throw nre;
//throwException();
withdraw(100,1000);
}
//create a withdaw method for balance and amount

public static void withdraw(int balance,int amount) {
if(amount>balance) {
throw new RuntimeException("You balance is too low");
}
}
public static void throwException() {
throw new ArithmeticException();
}
public  static void browser() {
	case "chrome":
	System.out.println("Using chrome browser");
	break;
	case "firefox":
	System.out.println("using firefox browser");
	break;
	
	
	
}
}
