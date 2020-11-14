package syntax14ObjectAndClasss;
public class Dogs {

String name;
String breed;
int age;
String color;

public static void main(String[] args) {
	
Dogs dog1=new Dogs(); 
dog1.name="Tuzik";
dog1.breed="Candin";
dog1.age=20;
dog1.color="Black";

Dogs dog2=new Dogs();
dog2.name="Aktaban";
dog2.breed="Candin";
dog2.age=30;
dog2.color="Yelow";		
System.out.println("I have dog: " +dog2.name+" is color: "+dog2.color);
System.out.println("Age is: "+dog2.age);
}}