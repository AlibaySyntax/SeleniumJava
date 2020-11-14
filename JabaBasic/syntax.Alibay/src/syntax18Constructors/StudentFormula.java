package syntax18Constructors;
public class StudentFormula {

int rollno;
String name;
float fee;
StudentFormula (int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display() { System.out.println(rollno+" "+name+" "+fee);	
}
static class TestThis2{
public static void main(String args[]) {
StudentFormula s1=new StudentFormula (111,"ankit",5000f);
StudentFormula s2=new StudentFormula (112,"sumit",6000f);
s1.display();
s2.display();
}}}
