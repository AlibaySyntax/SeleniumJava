package syntax09ArrayAny;

public class Patterns {

	public static void main(String[] args) {
		//********
		for(int a=1; a<=5; a++) {
				System.out.print("*");//no println
		}
		/*
		 * ********
		 * ********
		 * ********
		 * ********
		 */
		System.out.println("====using ");
		for(int a=1; a<=5; a++) {
			System.out.print("*");
		}
		System.out.println();
		for(int a=1; a<=5; a++) {
			System.out.print("*");
		}
		System.out.println();
		for(int a=1; a<=5; a++) {
			System.out.print("*");
		}
	
	

		System.out.println("=====printing pattern using nexted lopps=======");
		
		for (int i=4; i<=4;i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

}	
}



