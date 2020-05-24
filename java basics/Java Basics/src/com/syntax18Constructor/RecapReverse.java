package com.syntax18Constructor;
public class RecapReverse {
	
protected int sumFromArray(int[]array) {
	int total=0;
	for(int i=0; i<array.length; i++) {
		total +=array[i];
	}
	return total;
}
public static String getReverse(String str) {
	String reverse="";
	for (int i=str.length()-1; i>=0; i--){
		reverse+=str.charAt(i);
	}
	return reverse;
}
private static String getVowe(String str) {
	String vowes="";
	vowes=str.replaceAll("[^aei0uAEIOU]","");
	return vowes;
}
public static void main(String[]args) {
	
	RecapReverse obj =new RecapReverse();
	int []array = {2,7,19,857};
	System.out.println("total: " + obj.sumFromArray(array));
	
	String str=RecapReverse.getReverse("Hello GOOD");
	System.out.println(str);
	System.out.println("Good");
	
	System.out.println();
	System.out.println();
}}
