package com.syntax.syntax26Encapsulations;
public class DoctorTest {

public static void main(String[] args) {
Doctor doc=new Doctor();
doc.Email("doctor@mail.com");
System.out.println(doc.getEmail());

doc.Email("hospytal@mail.com");
System.out.println(doc.getEmail());
	}

}
