package com.syntax.syntax23Fainal;

public class ComputerTest {

public static void main(String[] args) {
	
Computer[] comps= {new Apple("Apple,Macbook"),new HP("Lenovo"),new MS ("Microsoft") };

for(Computer c:comps) {
c.run();
c.save();
c.storage();
c.transfer();
System.out.println("---------  ------");
}

Apple app=new Apple("Apple");
app.safe();

SmartMachine sm=new HP("HP");
sm.smart();

}}


