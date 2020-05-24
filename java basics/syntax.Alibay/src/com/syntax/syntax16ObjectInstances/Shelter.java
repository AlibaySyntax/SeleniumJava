package com.syntax.syntax16ObjectInstances;
public class Shelter {
public static void main(String[] args) {
//access instance variables
DogStaticSame puppy=new DogStaticSame();
puppy.name="Charly";
System.out.println(puppy.name);

//access static variables from different class
System.out.println(DogStaticSame.breed);

	}

}
