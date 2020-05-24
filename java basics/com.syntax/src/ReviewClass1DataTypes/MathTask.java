package ReviewClass1DataTypes;
public class MathTask {
public static void main(String[] args) {
		int number1=10;
		int number2=2;
		
		
	int sum=number1+number2;
	int subtraction=number1-number2;
	int multiplicaton=number1*number2;
	int division=number1/number2;
	
	System.out.println("number is "+ number1);
	System.out.println("number is "+ number2);
	System.out.println("number is "+ number1+number2);
	System.out.println("number is "+ (number1+number2));
	System.out.println("number is "+ sum);
	System.out.println();
	System.out.println("The sum is: "+sum);
	System.out.println("The substraction is: "+subtraction);
	System.out.println("The multiplication is: "+ multiplicaton);
	System.out.println("The division is: "+ division);
	
	System.out.println("======================================="); 
	int result=29/10;//2.9
	System.out.println("The result of division is "+result);
	int mod=29%10;
	System.out.println("The remainder of division is "+mod);
	
	double doubleResult=29/10;
	System.out.println("The doubleResult of division is "+doubleResult);
	
	double doubleResult2=29.0/10.0;
	System.out.println("The doubleResult of division is "+doubleResult2);
	System.out.println("------Type Conversion---------");
	int intNumber=25;
	double doubleNumber=(double)intNumber;
	System.out.println("The doubleNumber of division is "+doubleNumber);
}}
