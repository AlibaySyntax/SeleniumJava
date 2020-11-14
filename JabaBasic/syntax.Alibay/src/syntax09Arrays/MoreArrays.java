package syntax09Arrays;

public class MoreArrays {

	public static void main(String[] args) {
		//arrays are fixed in size
          String[] students=new String[3];
          students[0]="Hassna";
          students[1]="Faisal";
          students[2]="Kemal";
          //students[3]="Aaron";--->during run time java machine will give
          //System.out.println(students[3]);
  //if we store less elements than we declared
  //compiler will add default values        
     String[]inClassStudents=new String[5];
     inClassStudents[1]="Hichem";
     inClassStudents[2]="Tetehh";
     inClassStudents[3]="Hich";
     inClassStudents[4]="Tet";
     //inClassStudents[5]="chem";-->will get ArrayIndexOutOfBoundExeption
     
     System.out.println(inClassStudents[1]);
          
}}
