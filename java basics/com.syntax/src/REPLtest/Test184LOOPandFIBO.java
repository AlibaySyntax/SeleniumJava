package REPLtest;
import java.util.LinkedList;
public class Test184LOOPandFIBO {
	
public static void main(String[] args) {
LinkedList<Integer>	num=new LinkedList<>();	
int count = 10, num1 = 0, num2 = 1;
//System.out.print("Fibonacci Series of "+count+" numbers: ");

for (int i = 1; i <= count; ++i)
{
System.out.print(num1+" ");

/* On each iteration, we are assigning second number
* to the first number and assigning the sum of last two
* numbers to the second number */
int sumOfPrevTwo = num1 + num2;
num1 = num2;
num2 = sumOfPrevTwo;
}}}


