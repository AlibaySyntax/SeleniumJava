package com.syntax30MAP;

public abstract class abstractStore {
String type,name;
public abstractStore(String type,String name) {
this.name=name;
this.type=type;
}
//@Override
public void display() {
System.out.println("This is store "+name);	
}
public abstract void  workingHours();
public void workingHours(String type,String name) {
//System.out.println("brooooo");

//super type=type;
//super name=name;
System.out.println(type+ "works from: 8:00am-19:00");
}
 abstract class Nike  {
}		
}
