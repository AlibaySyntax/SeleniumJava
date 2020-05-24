package com.syntax.ReviewClass6Manipulation;
public class School {
	
public static void main(String[] args) {
MathOperation math=new MathOperation();

int result=math.add(4,5);
System.out.println("result is " +result);

math.add2(4, 5);
System.out.println(math.add(5,2));

result=math.multiply(3,4);
System.out.println("multiplication result is " +result);
//Cannot access this method, because it isprogram
//math.smth();
}
}
