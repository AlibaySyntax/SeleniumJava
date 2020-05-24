package com.syntax.syntax19Constructors;
public class usingThis {
	
usingThis(){	
this(1);//Always must be 1 line inside constructor
//this(1,2);//CE:
System.out.println("Hi");
}

usingThis(int x){	
this (1,2);
System.out.println("Hello");
}

usingThis(int x, int y){
System.out.println("How are you");	
}

public static void main(String[]args) {
usingThis obj =new usingThis(1);

}
}
