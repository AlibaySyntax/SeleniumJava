package Review04;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
		//find largest and smallest number in the array
		
		int[] numbers = {34, 67, 3, 94, 56, 72, 17, 33};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		int sum = 0;
		
		for(int num:numbers) {
			if (num>largest) {
				largest=num;
			}
			if ( num < smallest) {
				smallest = num;
			}
			sum += num;
		}
		System.out.println("The largest number is: " + largest);
		System.out.println("The smallest number is " + smallest);
		System.out.println("The sum of the all numbers is :" + sum) ;
		
		
  
			

	}

}
