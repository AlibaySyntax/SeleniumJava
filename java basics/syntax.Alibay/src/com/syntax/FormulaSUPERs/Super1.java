package com.syntax.FormulaSUPERs;

public class Super1 {

class Furniture {
Furniture () {
System.out.println ("Furniture class Constructor"); 
}
}
class Chair extends Furniture {
Chair () {
super();  
System.out.println ("Chair class Constructor"); 
}
class MainClass {
public         void main (String args [] ){
Chair d = new Chair() ;
}}}}

