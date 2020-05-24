package com.syntax27Collections;

import java.util.ArrayList;

public class IteratorToRemove {

	public static void main(String[] args) {
	ArrayList<String>drinks=new ArrayList<>();
	drinks.add("water");
	drinks.add("milk");
	drinks.add("iuce");
	drinks.add("tea");
	drinks.add("coffee");
	drinks.add("tea");
	
	for(int i=0; i<=drinks.size(); i++) {
	if(drinks.get(i).equals( "milk")||drinks.get(i).equals("tea")) {
		drinks.remove(i);
	}
	}
System.out.println(drinks);
	}
}
