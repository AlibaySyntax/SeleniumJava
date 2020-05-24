package com.syntax.FormulaSUPERs;

public class Super2 {
class Furniture {
void color (){
System.out.println ("Furniture color ..."); 
}
}		
class Chair extends Furniture {
void color() {
System.out.println ("Chair color ..."); 
}
void height() {
System.out.println("5 ft "); 
}
void work() {
super.color ();//super 
height (); 
}
}
class MainClass {
public             void main (String args []) {
Chair obj = new Chair()  ; 
obj.work ();	
}
}}
