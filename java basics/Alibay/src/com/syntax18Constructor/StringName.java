package com.syntax18Constructor;

public class StringName {
	String name;
	int grade1, grade2, grade3;

StringName(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
name=studentName;
grade1=studentGrade1;
grade2=studentGrade2;
grade3=studentGrade3;
}
public int gradeAverage() {
	int total=grade1+grade2+grade3;
	int average=total/3;
	return average;	
}
public static void main(String[]args) {
	StringName obj1=new StringName(" Ali ", 80, 89, 90);
	System.out.println("Student:" +obj1.name+"avarage grade is " + obj1.gradeAverage());
	StringName obj2=new StringName(" Alik ", 85, 78, 90);
	System.out.println("Student:" +obj2.name+"avarage grade is " + obj2.gradeAverage());
	StringName obj3=new StringName(" Aliko ", 90, 82, 95);
	System.out.println("Student:" +obj3.name+"avarage grade is " + obj3.gradeAverage());
}
}