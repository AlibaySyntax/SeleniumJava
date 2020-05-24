package com.syntax.ReviewClass4Array2DArrays;
import java.util.Scanner;
public class ScannerArray {
public static void main (String[] args) {
	//Use scanner to ask for the size of the array
	//Then, read numbers from the scanner into the array
	//Then print the whole array
Scanner scan=new Scanner(System.in);
System.out.println("How many elements do you want boddy? ");
int size=scan.nextInt();
int[]nums=new int[size];
//System.out.println("Give me 4 numbers, separated by space: ");
//for(int i=0; i<size;  i++) {
//nums[i]=scan.nextInt();
//}
//i am creating an array with size=Whatever he/she gave us
//This for loop inserts numbers into array
for(int i=0; i<size;  i++) {
System.out.println("Give me a number to store in the Array");
nums[i]=scan.nextInt();
}
System.out.println("Let's see what you gave me: ");
//This enhanced for loop reads numbers from the array
for (int n: nums) {
System.out.println(n);

}}}
