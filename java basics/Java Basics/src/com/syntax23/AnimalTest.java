package com.syntax23;
public class AnimalTest {

public static void main(String[] args) {
		
Animal an =new Bird();
an.sleep();
//an.eat();
an.whoAmI();
System.out.println("----Second Metod----");
Animal.whoAmI();
Bird.whoAmI();
}
}

