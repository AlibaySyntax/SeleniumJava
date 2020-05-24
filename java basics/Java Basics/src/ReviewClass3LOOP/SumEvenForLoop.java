package ReviewClass3LOOP;
public class SumEvenForLoop {
public static void main(String[] args) {
		//
	 int totalOdd=0, totalEven=0, grandTotal=0;
	 
	 for (int count=1; count<=50; count++){
    	if(count%2==0) {
    		totalEven+=count;
    	}else {
    		totalOdd+=count;
    	}
    	
    	
      //2nd way to calculate grandaTotal
      grandTotal += count;
	 
      System.out.println("totalEven is = "+totalEven);
      System.out.println("totalOdd is = "+totalOdd);
      //1st way
      //grandTotal=totalEven+totalOdd;
      System.out.println("grandTotal is = "+grandTotal);
}}}
