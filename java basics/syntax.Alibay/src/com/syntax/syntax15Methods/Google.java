package com.syntax.syntax15Methods;
public class Google {

	//define features such as employeeID,last name
	//define a behavior working, get paid, attending meetings
	int empId;
	double salary;
	String name, lastName,title;
	void working() {
		System.out.println(title+ " is working");	
	}
	void getPaid() {
		System.out.println(name+" is getting paid "+ salary);
	}
	void attendMeetings() {
	System.out.println(name+" attending meetings");
	}
	public static void main(String[]args) {
	  //creating first object
		Google emp1=new Google();
		emp1.empId=123;
		emp1.name="John";
		emp1.lastName="Smith";
		emp1.title="CEO";
		emp1.salary=200000;
		emp1.working();
		emp1.getPaid();
		emp1.attendMeetings();
		
		//creating second object
		Google emp2=new Google();
		emp1.empId=124;
		emp1.name="Johnyy";
		emp1.lastName="Smithyyy";
		emp1.title="CEO";
		emp1.salary=100000;
		emp1.working();
		emp1.getPaid();
		emp1.attendMeetings();
		//emp2.playing();;CE: define playing method in the class
		}}
	
	


