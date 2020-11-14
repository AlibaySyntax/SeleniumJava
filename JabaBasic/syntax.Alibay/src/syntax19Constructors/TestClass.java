package syntax19Constructors;
public class TestClass  {
	
public static void main(String[]args) {
Dog dog=new Dog() ;
//acces vatiable from own class
dog.breed="Husky";
//access vaiable from parent class
dog.color="Grey";
dog.fur="Too much";
dog.size="Big";

//access method from own class
dog.bark();
//access methods from parent class 
dog.beWild();
dog.eat();
dog.sleep();

Animals animal=new Animals();
//can acces only features define withing it
animal.color="Any";
animal.size="Any";
animal.fur="Any";

animal.sleep();
animal.eat();
animal.beWild();
//System.out.println(dog);
}}

