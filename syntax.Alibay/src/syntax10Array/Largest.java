package syntax10Array;

public class Largest {

	public static void main(String[] args) {
		// find largest element from an array
		
		int[] nums = {200,30,-1,900,56,787};
		
		int largest=nums[0];//200
		for(int i=0; i<nums.length; i++) {
			if(nums[1]>largest) {
				largest=nums[i];
			}
		}
		System.out.println("largest num is " + largest);
		

	}

}
