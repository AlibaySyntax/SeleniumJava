package syntax23Fainal;
public class StudentTest {

public static void main(String[] args) {
	
System.out.println("--student Oject & Reference Stud types--");		
Student student=new Student() ;
student.study();
student.doHomework();

System.out.println("--SyntaxStudent Object & Ref SynStud type--");
SyntaxStudent syntax=new SyntaxStudent();
syntax.doHomework();
syntax.study();
syntax.getJob();

System.out.println("--SyntaxStudentObject & Student Refer-ce Type--");
Student st=new SyntaxStudent() ;
st.study();
st.doHomework();
}
}
