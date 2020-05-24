package com.syntax29CollectionsHashSet;

import java.util.*;
import java.util.*;

public class Setfamaly {

public static void main(String[] args) {
Set<String>veggies=new TreeSet<>();
veggies.add("carrot");
veggies.add("potato");
veggies.add("cucum");
veggies.add("egglant");
veggies.add("potato");
veggies.add("cucumber");
veggies.add("tomato");
System.out.println(veggies);
//LinkedHashSet guarantee insertion order
Set<String> fruits=new LinkedHashSet<>();
fruits.add("apple");
fruits.add("mango");
fruits.add("kiwi");
fruits.add("tomato");
fruits.add("banana");
fruits.add("mango");
fruits.add("tomato");
System.out.println(fruits);
//Tree set stories objects in ascending order
Set<Object>food=new TreeSet(veggies);
food.addAll(fruits);
System.out.println(food);
}}
