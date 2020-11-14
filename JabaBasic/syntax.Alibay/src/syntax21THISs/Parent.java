package syntax21THISs;
public class Parent  {

String name="Farid";
String lastName="Smith";

void hello() {
System.out.println("I am parent class method");
}}
class Child extends Parent{
String name="Ahmaet";

public void display() {
System.out.println(this.name);
System.out.println(lastName);
System.out.println(super.name);
}
void sayHello() {
display();//compiler adds this
hello();//compiler adds super
super.hello();
}
}