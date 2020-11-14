package syntax02DoubleDataTypes;

public class ModuleOperator {

	public static void main(String[] args) {
//float can hold up to 5-7 decimals
float f=12.50f;//result 4.6296296
float f1=2.7f;
//double can hold up 14-15 decimals
double d=12.50;//4.62962962962963
double d1=2.7;

float result=f/f1;
double result3=d/d1;
System.out.println(result);
System.out.println(result3);

int i=12;
int y=7;

int result1=i/y;//1       .0987
double result2=i/y;

System.out.println(result1);
System.out.println(result2);


//int always round up with out points
//float and double NOT rounding up, keeps decimals
   

// modulus 


int v=16;
int w=7;


int mod= v%w;
System.out.println(mod);

//i would like to devide 12/7
// int num1=12.5;not possible to store decimals into int

double num2=12;//we can store int into double
double num3=7;

System.out.println(num2);
System.out.println(num2/num3);






	}

}
