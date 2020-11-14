package syntax07Loop;

public class LoopsMoreReview {

	public static void main(String[] args) {
		// to print number from 50 to 1
		
		for(int i=50; i>=1;i--) {
			System.out.println(i);
		}
		// print odd number between 20 and 50
		System.out.println("-----------");
		for( int i=20;i<=50; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("---------");
		for(int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		System.out.println("----------");
		//what is the output
		int total = 2;
		for(int k=1; k<4; k++) {
			total=total*k;
		}
		System.out.println(total);

	}

}
