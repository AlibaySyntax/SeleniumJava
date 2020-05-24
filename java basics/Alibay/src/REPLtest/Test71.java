package REPLtest;
public class Test71 {
public static void main(String[] args) {
//Write a program that creates an array of integers that stores the following values: 
//45,78, 12,  67, 55, 89, 23, 77, 88
//Print only values that stored with even index including 0.		

	int[]a=new int[9];
	a[0]=45;
	a[1]=78;
	a[2]=12;
	a[3]=67;
	a[4]=55;
	a[5]=89;
	a[6]=23;
	a[7]=77;
	a[8]=88;
	
	//access elements from an array
	System.out.print(a[0]);
	System.out.print(a[2]);
	System.out.print(a[4]);
	System.out.print(a[6]);
	System.out.print(a[8]);
	System.out.println();
}}
