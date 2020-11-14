package syntax03DTypesINT;

public class AlibayDoubleCanChange {

	public static void main(String[] args) {
		
	       
		          //1).Widening,happens implicitly
		          double d=10.99;
		          System.out.println(d);
		          
		          //int i=10.99--> complete time error saying;
		          //2).time mismatch, cannot convert double to int;
		          //3).arrowing, expilicitly implementing
		          int i= (int) 10.99;
		          System.out.println(i);
		          
		          //4).byte -128 to 127
		          byte b= (byte) 1284589608;
		          System.out.println(b);
		
		
		
		
		          
		
		
		
		
		
		
		
		
		

	}

}
