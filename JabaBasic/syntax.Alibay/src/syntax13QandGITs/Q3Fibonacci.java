package syntax13QandGITs;
public class Q3Fibonacci {
public static void main(String[] args) {
//Write a Java program of Fibonacci series		
//0 1 1 2 3 5 8

int a,b,c;
a=0;
b=1;

for(int i=1; i<=10; i++) {
	
	System.out.print(a+" ");
	c=a+b;
	a=b;
	b=c;
}

}

}
