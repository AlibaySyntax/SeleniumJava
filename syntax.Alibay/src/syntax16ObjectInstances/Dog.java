package syntax16ObjectInstances;
public class Dog {
		
String name, size;
int age;

void displayDog() {
System.out.println("Dog name is "+name+" and it "+size+" dog and age is "+age);	
}
public static void main(String[]args) {

Dog dog1= new Dog();
dog1.name="Lucy";
dog1.size="Big";
dog1.age=5;
dog1.age=6;
//System.out.println("Dog 1 name is "+dog1.name);

Dog dog2= new Dog();
dog2.name="Sharik";
dog2.size="small";
dog2.age=2;
//System.out.println("Dog 2 name is "+dog2.name);

Dog dog3= new Dog();
dog3.name="Pepsi";
dog3.size="Big";
dog3.age=10;
//System.out.println("Dog 3 name is "+dog3.name);

dog1.displayDog();
dog2.displayDog();
dog3.displayDog();
}}

