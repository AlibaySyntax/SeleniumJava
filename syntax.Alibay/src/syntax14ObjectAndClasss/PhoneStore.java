package syntax14ObjectAndClasss;
public class PhoneStore {
String brand;
String color;
String model;


public static void main(String[] args) {
PhoneStore iPhone=new PhoneStore();
iPhone.brand="iPhone";
iPhone.color="White";
iPhone.model="X Max";

//iPhone.dial();
//iPhone.text();
//iPhone.pics();

PhoneStore android=new PhoneStore();
android.brand="Samsung";
android.color="Black";
android.model="Note 10";

//android.dial();
//android.text();
//android.pics();

PhoneStore nokia=new PhoneStore();
nokia.brand="Nokia";
nokia.color="Black";
nokia.model="Note 10";

//nokia.dial();
//nokia.text();
//nokia.pics();	
String str="Hello friends";
str.replace("Hello", "Welcome");
System.out.println(str);
}
}
