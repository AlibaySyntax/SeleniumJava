package com.syntax.syntax16ObjectInstances;
public class LocalVariablesMix {
	
void nameInside() {
String name="John";	//local variable that visible only within methon int was declared 
}
void anotherName() {
String name="Jane";
}
public static void main(String[]args) {
//System.out.println(name);CE: name won; t be visible to another method
//since its scope only within nameInside method
	
LocalVariablesMix obj=new LocalVariablesMix();
obj.nameInside();

boolean flag=true;
if(flag) {
String answer="Yes";
}
//System.out.println(answer);CE:scope of variable answer is not visible outside of
for(int i=1; i<=5; i++) {
System.out.print(i);
}
for(int i=1; i<=5; i++) {
System.out.print(i);
}
String name="Ali";
}
}
