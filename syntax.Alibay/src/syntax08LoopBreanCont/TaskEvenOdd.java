package syntax08LoopBreanCont;

public class TaskEvenOdd {

	public static void main(String[] args) {
		int evensSum=0;
		int oddsSum=0;
		
		for (int i=1; i<=99; i++) {
			if(i%2==0) {
			    evensSum=evensSum+i;
			}else {
				oddsSum=evensSum+i;	
			}}
			System.out.println("Sum of evens = "+evensSum);
			System.out.println("Sum of odds = "+oddsSum);
	
}}

