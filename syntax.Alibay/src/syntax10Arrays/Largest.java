package syntax10Arrays;
public class Largest {
public static void main(String[] args) {
		 //find largest element from an array
         int [] nums= {200,30,-1,900,56,787,3000};
         
         int largest=nums[0];//200
         
         for(int n=1; n<nums.length; n++) {
        	 if (nums[n]>largest) {
        		 largest=nums[n];
        	 }
         System.out.println("largest num is "+largest);	 
}}}
