package syntax16ObjectInstances;
public class DogStaticSame {
//instance variable
String name, size;
int age;
//static variables
static String breed="Husky";
static int paws=4;
static int tail=1;
static int eyes=2;

void displayDog() {
System.out.println("Dog name is "+name+" and it "+size+" dog and age is "+age);	
System.out.println("Dog breed is "+breed+" and it has "+paws+" paws and "+tail+" tail");	
}	
public static void main(String[] args) {

DogStaticSame dog1= new DogStaticSame();
//how to access instance variable?-->by creating an object and using reference variable
dog1.name="Lucy";
dog1.size="Big";
dog1.age=5;
dog1.age=6;
dog1.displayDog();

System.out.println(DogStaticSame.breed);
System.out.println(DogStaticSame.paws);
System.out.println(dog1.breed);
System.out.println(breed);


DogStaticSame dog2= new DogStaticSame();
dog2.name="Sharik";
dog2.size="small";
dog2.age=2;
dog2.displayDog();
//System.out.println("Dog 2 name is "+dog2.name);
breed="Bulldog";

DogStaticSame dog3= new DogStaticSame();
dog3.name="Pepsi";
dog3.size="Big";
dog3.age=10;
dog3.displayDog();
//System.out.println("Dog 3 name is "+dog3.name);

//dog1.displayDog();
//dog2.displayDog();
//dog3.displayDog();	
}}
