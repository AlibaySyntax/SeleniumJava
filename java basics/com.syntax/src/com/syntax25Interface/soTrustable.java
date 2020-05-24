package com.syntax25Interface;

interface CreditUnion {
void giveCredit();	
}
class Finance {	
public void financing() {
System.out.println("Dealing with financing");	
}
}
public interface   soTrustable {
	
void trust();
void giveCredit();
}
interface Bank extends soTrustable{
	
void deposit();	
void withdrawl();				
}
class BOA extends Finance implements soTrustable, Bank, CreditUnion  {

@Override
public void trust() {
System.out.println("BOA is trustable");	
}
@Override
public void deposit() {
System.out.println("You can make a deposit at BOA");	
}
@Override
public void withdrawl() {
System.out.println("You can withdrawl you money at BOA");	
}	
@Override
public void giveCredit() {
System.out.println("BOA gives credit");
}	
}
//interface CreditUnion {
//void giveCredit();	
//}
//class Finance {	
//public void financing() {
//System.out.println("Dealing with financing");	
//}
//}
