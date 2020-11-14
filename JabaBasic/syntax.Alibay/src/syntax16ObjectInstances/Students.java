package syntax16ObjectInstances;
public class Students {	
String studentName;
String studentID;
int numberOfStudents;
int sum;
public static void main(String[] args) {	
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		
		s1.numberOfStudents=1;
	    s1.studentName="Ali";
	    s1.studentID="12345";
	    
	    s2.numberOfStudents=2;
	    s2.studentName="Alik";
	    s2.studentID="123456";
	    
	    s3.numberOfStudents=3;
	    s3.studentName="Aliko";
	    s3.studentID="1234567";
	    
	    int sum=s1.numberOfStudents+s2.numberOfStudents+s3.numberOfStudents;
	    System.out.println(sum);
}}
