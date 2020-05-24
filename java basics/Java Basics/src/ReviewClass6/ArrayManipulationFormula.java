package ReviewClass6;
public class ArrayManipulationFormula {

public static void main(String[]args) {
	
int[]arr= {5,2,9,6,1,8};
ArrayManipulation manip=new ArrayManipulation();
int largest=manip.largestNumber(arr);
System.out.println("largest is " +largest);
System.out.println("Smallest is " + manip.smallestNumber(arr));
}
public int largestNumber(int[]array) {
	
int largest = array[0];
for(int i=0; i<array.length; i++) {
if(array[i]>largest) {
largest=array[i];
}}
return largest;		
}		
public int smallestNumber(int[]array) {
	
int smallest=array[0];
for(int num:array) {
if (num<smallest) {
smallest=num;
}}
return smallest;
}
private static double findAverage(int[]array) {
	
int sum =0;
for(int num:array) {
sum+=num;
}
return sum;
}}


