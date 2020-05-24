/**
 * 
 */
package REPLtest;/*** @author apple**/
import java.util.ArrayList;
import java.util.Iterator;
public class Test180 {          /*** @param args*/
public static void main(String[] args) {

	ArrayList<Integer> arl=new ArrayList<>();
	arl.add(222);
	arl.add(333);
	arl.add(444);
	arl.add(555);
	arl.add(666);
	System.out.println(arl);
	System.out.println(arl);
	
    arl.removeAll(arl); 

	System.out.println(arl);
	System.out.println(arl);
	System.out.println(arl);
}}



	
