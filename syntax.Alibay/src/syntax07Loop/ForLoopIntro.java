package syntax07Loop;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		//Good morning 5 times
		
		for(int c=1;c<6; c++) {
			System.out.println("Good morning");
		}
		System.out.println("=============");
		//what will be the output?
		for(int i=0;i<=50; i+=5) {
			System.out.println(i);
		}
		System.out.println("============");
		//what is the output
		int sum=0;
		for (int i=1; i<5; i++) {
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
