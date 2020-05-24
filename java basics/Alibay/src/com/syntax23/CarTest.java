package com.syntax23;
public class CarTest {

public static void main(String[] args) {
		
Car bmw=new BMW("BMW");
Car tesla=new Tesla("TESLA");
Car merc=new Mercedes("Mercedes");
Car honda=new Honda("Honda");

Car [] cars={new BMW("BMW."),new Tesla("Tesla."),new Mercedes("Mercedes."),new Honda("Honda.")};

for(Car ca:cars) {
ca.display();	
ca.start();
//ca.display();

System.out.println("--------------------");	
}
System.out.println("--------------------");
for(int i=0; i<cars.length; i++){
cars[i].display();	
cars[i].start();
System.out.println();//Это пробел

}
}
}

