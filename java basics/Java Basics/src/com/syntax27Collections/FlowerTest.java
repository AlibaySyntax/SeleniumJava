package com.syntax27Collections;
import java.util.ArrayList;

public class FlowerTest {

public static void main(String[] args) {
//flower into array
Flower [] FlowerArray= {new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};
//store flower into arraylist
ArrayList<Flower>flowers=new ArrayList<>();
flowers.add(new Rose("Rose"));
flowers.add(new Tulip("Tulip"));
flowers.add(new Sunflower("Sunflower"));

//flowers.add("Rose");cannot add String Object into ArrayList of Flower Object
	

	}

}
