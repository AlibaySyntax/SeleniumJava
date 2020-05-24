package com.syntax.syntax18Constructors;
public class Method {
	        private Method() {
	        Method obj=new Method ();	
			System.out.println("Public constructor");
			}
	        Method(int num){
	        Method obj=new Method ();	
			System.out.println("Default constructor");	
			}
			protected Method(int num, int num1) {
			Method obj=new Method();
			System.out.println("Protected constructor");	
			}
			public Method (String str) {
			Method obj=new Method();	
			System.out.println("Private constructor");
}}
