package ReviewClass3LOOP;
public class Task1continueAndOR {
public static void main(String[] args) {
//print number from 15 to 35
//but don't print numbers that are divisible by 2 and 3

	for (int i=15; i<=35; i++) {
		
		//1 wy divisible by 6
		
		//if(i%6==0) {
			//continue;
		//}
		//System.out.println(i);
		
		//2 way using &&
		
		//if(i%2==0 && i%3==0) {
			//continue;
		//}
		//System.out.println(i);
		
		//3way using OR ||
		
		if (i%2!=0 || i%3!=0) {
			System.out.println(i);	
		}
	}
	
	
	
	
}}
