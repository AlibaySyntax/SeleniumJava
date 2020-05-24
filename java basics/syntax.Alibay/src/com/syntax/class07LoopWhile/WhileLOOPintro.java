package com.syntax.class07LoopWhile;

public class WhileLOOPintro {
public static void main(String[] args) {
	
	int time=3;
    if (time<6){
    	System.out.println("Good morning");
    }
    System.out.println("-----while LOOP----");
//    while(time<12) {
//       System.out.println("Good morning");//code will execute infinitely	
    
    while (time<2){
	System.out.println("Good morning");
	time++;
    }
    // how to print numbers from 1 to 50?
    int num=1;
    while(num<=50) {
    System.out.println(num);
    num++;
    }
    // how to print numbers from 20 to 30
    int num1=20;
    while(num1<=30) {
    System.out.println(num1);	
    num1++;
    }
    System.out.println("***************************");
    // how to print number from 5 to all in  1 time
    int num2=5;
    while(num2<=15) {
    	System.out.println(num2+"");
    	num2++;
    }
    System.out.println("***************************");
    //how to print values from 10 to 17
    int num3=10;
    while(num3<=1) {
    	System.out.println(num3+"");
    	num3--;
    }
    //how to print 50 to 1
    //how to print odds numbers from 1 to 20
    int num4=50;
    while (num4<=50) {
    	System.out.println(num4+"");
    	num4++;	
    }
   
    
    
    }}

