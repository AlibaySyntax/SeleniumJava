package com.syntax.syntax21THISs;
public class PrivateVoid {

private void display(String name, String lastName) {
System.out.println(name+""+lastName);
}

private void display(String name, String lastName,String nickName) {
System.out.println(name+""+lastName+""+nickName);
}

private void display(String name, String lastName,String nickName, String middleName) {
System.out.println(name+""+lastName+""+nickName+""+middleName);
}

public static void main(String[]args) {
PrivateVoid	man=new PrivateVoid();
man.display("Ivan ","Ivanov");
man.display("Ivan ","Ivanov ","Ivanovich");
man.display("Ivan ","Ivanov ","Ivanovich ","Paxan");

}}
