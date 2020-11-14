package SLAK;

public class Employees {

	
//Create a Class called Employee:
//Create three  variables  eID , salary and set the CEO to "Sumair" 
//Create two objects of the class Employee 
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects 
  int eID;
  int Salary;
  String position;
  public static String Corp="Gumar";
  public static void main(String[] args) {
	  
  Employees Ivan=new Employees();
  Ivan.eID=34563;
  Ivan.Salary=150000;
  Ivan.position="Developer";
  Corp =Ivan.Corp;
  
  Employees Esmat=new Employees();
  Esmat.eID=34562;
  Esmat.Salary=150000;
  Esmat.position="cybertech";
  Corp =Esmat.Corp;
  
  System.out.println("Ivan is working in Dell company as "+ Ivan.position+ " his Employee ID is "+Ivan.eID+ " and his salary is "+Ivan.Salary);
  System.out.println("Esmat is working in Deloitte company as "+ Esmat.position+ " his Employee ID is "+Esmat.eID+" and his salary is "+Esmat.Salary);
  System.out.println("And thier Corp is " +Corp);
}}
