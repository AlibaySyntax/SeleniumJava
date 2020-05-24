package com.syntax.FormulaInharitances;

public class MultiLevel {

class Faculty { 
float total_sal=0, salary=30000; 
} 
		
class HRA extends Faculty { 
float hra=3000; 
} 
	
class DA extends HRA { 
float da=2000; 
} 
		
class Science extends DA { 
float bonus=2000;
public void main (String args[]) {
Science obj=new Science (); obj.total_sal=obj.salary+obj.hra+obj.da+obj.bonus;
System.out.println("Total Salary is:"+obj.total_sal); 
} }
	
	
	
}
