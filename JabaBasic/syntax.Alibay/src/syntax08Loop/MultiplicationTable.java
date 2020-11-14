package syntax08Loop;

public class MultiplicationTable {

	public static void main(String[] args) {
		/*
		 * we want to creat multiplication table
		 * 1x1=1
		 * 1x2=2
		 * 1x3=3
		 */
		int num = 1;
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + "*" + i + "=" + i*num);
			
		}

	}

}
