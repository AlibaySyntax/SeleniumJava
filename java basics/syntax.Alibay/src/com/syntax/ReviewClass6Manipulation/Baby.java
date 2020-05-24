package com.syntax.ReviewClass6Manipulation;
public class Baby {
String firstName;
String lastName;
char gender;
int weight;
String hairColor;

public void walk() {
System.out.println("Crawling...");
}
protected String cry() {
return "Cry every minute...";
}
void talk(int times) {
for(int i=1; i<=times; i++);
System.out.println("Bla Bla Bla");
}

public void displayBabyInfo() {
System.out.println("Full name of baby is "+firstName+" "+lastName);
System.out.println("Gender is " +gender);
//System.out.println("Hair color is " +hairColor);
if(gender=='M') {
System.out.println("Boy");
}else if(gender=='F'){
System.out.println("Girl");
}
System.out.println("Unknown");

System.out.println("hair color is " +hairColor);
}}