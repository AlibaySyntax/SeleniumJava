package syntax16ObjectInstances;
class StudentFormula  {

int a;    
static int id = 35;    
void change(){        
System.out.println(id);    
}
}
class StudyTonight {    
public static void main(String[] args) { 
	
StudentFormula o1 = new StudentFormula();        
StudentFormula o2 = new StudentFormula();        
o1.change();        
StudentFormula.id = 1;        
o2.change();    
}}

