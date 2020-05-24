package com.syntax.syntax25Interfaces;
import java.util.function.IntBinaryOperator;

public class MyBeginnersBookClass {
public static void main(String args[]) {
        // lambda expression
IntBinaryOperator sum = (a, b) -> a * b;
System.out.println("Result: " + sum.applyAsInt(12, 100));

}}
