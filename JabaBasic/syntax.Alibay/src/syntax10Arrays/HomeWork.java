package syntax10Arrays;
public class HomeWork {
public static void main(String[] args) {
		
		//Task 1
		String[] animals= {"Fox", "Bear", "Dog", "Cat", "Tiger", "Otter"};
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i] + " ");
		}
		for (String animal:animals) {
			System.out.println(animal + " ");
		}
		//Task 2
		int [] nums= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int total=0;
		for (int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		System.out.println(total);
}}
