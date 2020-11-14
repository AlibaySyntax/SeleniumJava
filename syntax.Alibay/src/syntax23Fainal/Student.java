package syntax23Fainal;
public class Student {

	
public void study() {
System.out.println("Student studies");	
}
public void doHomework() {
System.out.println("Student do HomeWorks");	
}
}
class SyntaxStudent extends Student{
@Override

public void study() {
System.out.println("Syntax students are coding");
}
public void getJob() {
System.out.println("Syntax students become QA automation engineer");	
}
public void accessParrentOverridenMethod() {
super.study();
}
}
class collageStudent extends Student{
@Override
public void study() {
System.out.println("Colege Students have example");
}
}