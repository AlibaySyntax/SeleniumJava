package com.syntax03;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="Bye";
		
		//ctrl+space -->autocomplete
		System.out.println(a+b+x+y);//30 HelloBye
		System.out.println(a+x+b+y);//10 HelloBye
		System.out.println(x+y+a+b);//HelloBye 30 or HelloBye 1020
		System.out.println(x+y+(a+b));//1020HelloBye
		System.out.println(a+""+b+x+y);
		
		

	}

}
