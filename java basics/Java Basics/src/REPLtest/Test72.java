package REPLtest;

public class Test72 {

	//private static final (String args);

	public static void main(String[] args) {
		//String[] aray= {s,a,y,b,n,c,t,d,a,e,x};
		//aray [0]=a;
		String c;
		String s;
		String y;
		String b = null;
		String n;
		String t;
		String d;
		String e;
		String x;
		
		Object array;
		String[]inClassStudents=new String[5];
	     inClassStudents[1]="s";
	     inClassStudents[2]="a";
	     inClassStudents[3]="y";
	     inClassStudents[4]="b";
	     inClassStudents[1]="n";
	     inClassStudents[2]="c";
	     inClassStudents[3]="t";
	     inClassStudents[4]="d";
	     inClassStudents[2]="a";
	     inClassStudents[3]="e";
	     inClassStudents[4]="x";
	     //inClassStudents[5]="chem";-->will get ArrayIndexOutOfBoundExeption
	     
	     System.out.print(inClassStudents[1]);
	     System.out.print(inClassStudents[3]);     
	}

}
