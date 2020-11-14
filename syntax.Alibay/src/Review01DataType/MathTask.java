package Review01DataType;
public class MathTask {
public static void main(String[] args) {
		int number1=10;
		int number2=2;
		
		
	int sum=number1+number2;
	int sub=number1-number2;
	int mul=number1*number2;
	int div=number1/number2;
	
	System.out.println("number1 is: "+ number1);
	System.out.println("number2 is: "+ number2);
	System.out.println("The sum is not (10 & 2-just 102): "+ number1+number2);
	System.out.println("The sum is (10+2): "+ (number1+number2));// В скобке прибавляет
	System.out.println("The sum is: "+ sum);
	System.out.println();
	System.out.println("The sum is: "+sum);
	System.out.println("The substraction is: "+sub);
	System.out.println("The multiplication is: "+ mul);
	System.out.println("The division is: "+ div);
	
	System.out.println("===========================================");
	
	int result=29/10;// -> 2.9
	System.out.println("The result of division is "+result);
	//===============================================================
	int mod=29%10;// -> 9
	System.out.println("The remainder (mod) of division is "+mod);
	//===============================================================
	double doubleResult=29/10;// -> 2.0
	System.out.println("The doubleResult of division is "+doubleResult);
	//===============================================================
	double doubleResult2=29.0/10.0;// -> 2.9 
	System.out.println("The doubleResult2 of division is "+doubleResult2);
	//===============================================================
	
	System.out.println("============Type Conversion===============");
	int intNumber=25;
	double doubleNumber=(double)intNumber;// Changed from INT to DOUBLE
	System.out.println("The doubleNumber of division is "+doubleNumber);
}}
