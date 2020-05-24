package com.syntax.syntax25Interfaces;

public interface Shape {
	
void calculateArea(double a);
void calculatePerimeter(double b);
}
class Circle implements Shape {
@Override
public void calculateArea(double a) {
System.out.println("The area of the given circle is " + (10.14 * a * a));
}
@Override
public void calculatePerimeter(double b) {
System.out.println("The perimeter of the given circle is "+ (2 * 3.14 * b));
}
}
class Square implements Shape {
public void calculateArea(double a) {
System.out.println("The area of the given square is " + (a * a));
}
public void calculatePerimeter(double b) {
System.out.println("The perimeter of the given square is " + (4 * b));
}
}

