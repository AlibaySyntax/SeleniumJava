package Review05TwoDArrays;
public class TwoDArrayEnhanced {
public static void main(String[] args) {
	
	int[][]num= {{7, 1, 6, 12}, {9, 6, 2, 8},  {3, 0, 8, 5} };
	//iterating rows of a 2D array
	int sum=0;
	for(int[]row:num) {	
	//iterating elements of a row
	for(int element:row) {
	sum+=element;
		
	System.out.print(element + " ");	
}
    System.out.println();
}
	System.out.println("The sum is: "+sum);
}}