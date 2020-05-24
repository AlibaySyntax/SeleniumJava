package com.syntax18Constructor;
public class Method1 {

	    private Method1() {
		System.out.println("This is Private Method");
		}
	    Method1(int num){
		System.out.println("This is Default Method");	
		}
		protected Method1(int num, int num1) {
		System.out.println("This is Protected Method");	
		}
		public Method1(String str) {
		System.out.println("This is Public Method");
		}
		public static void main(String[]args) {
			Method1 obj=new Method1();
			Method1 obj1=new Method1();
			Method1 obj2=new Method1();
			Method1 obj3=new Method1();	
}}
