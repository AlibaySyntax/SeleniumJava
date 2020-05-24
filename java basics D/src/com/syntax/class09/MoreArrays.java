package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		
		
		String[]students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron"--> during run time java machine will give
		//ArrayIndexOutOfBoundsException
		//System.out.println(students[3]);
		
		
		//if we store less eleents than we declare
		//compiler will add defsault values
		String [] inClassStudents = new String[5];
		inClassStudents[0]="Hichem";
		inClassStudents[1]="Tetteh";
		
		System.out.println(inClassStudents[2]);
		
		
	}

}
