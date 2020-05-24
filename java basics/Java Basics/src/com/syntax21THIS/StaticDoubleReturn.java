package com.syntax21THIS;
public class StaticDoubleReturn {
	
static int method(int a,int b) {
int sum=a+(a*b);
return sum;
}

static double method(double a,double b) {
double sum=a+(a*b);
return sum;
}

static double method(int a,double b) {
double sum=a+(a*b);
return sum;
}

static double method(double a,int b) {
double sum=a+(a*b);
return sum;
}

public static void main(String[]args) {

StaticDoubleReturn c=new StaticDoubleReturn();
System.out.println(c.method(5,1));
System.out.println(c.method(5,2));
System.out.println(c.method(5,3));
System.out.println(c.method(5,4));
}}
