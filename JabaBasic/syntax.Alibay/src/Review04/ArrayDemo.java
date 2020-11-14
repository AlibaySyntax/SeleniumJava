package Review04;

public class ArrayDemo {

	public static void main(String[] args) {
		//silly way
		int a1 = 5;
		int a2 = 7;
		int a3 = 8;
		int a4 = 9;
		int a5 = 20;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		//professional way
		//declaring an array all elements have the default value
		System.out.println("--------------");
		
		int[]numbers = new int[5];
		// initializing values for array elements
		numbers[3]=9;
		numbers[0]=5;
		numbers[1]=7;
		numbers[2]=8;
		numbers[4]=20;
		
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//printing the element with index 2, third element
		System.out.println("Printing using index with variable");
		int index=2;
		System.out.println(numbers[index]);
		index++;
		System.out.println(numbers[index]);
		
			//method a. using for loop
		//this method can itarate from strart-point to end - point
			System.out.println("Reading from array using for loop");
			for(int number:numbers) {
				System.out.println(number);
			}
			
			//method b. using for each loop/advanced for loop/enhanced for loop
			//this method iterates the whole array
             for (int number :numbers)	{
            	 System.out.println(number);
             }	
             //2nd proffesional way of initializing array
             System.out.println("Second way using curly brackets");
             int[] numbers2 = {4,6,8,9,5};
             System.out.println("Lenght is " + numbers2.length);
             
             System.out.println("for loop");
             for(int j = 0; j<numbers2.length; j++) {
            	 System.out.println(numbers2[j]);
             }
             System.out.println("enhanced for loop");
             for(int number:numbers2) {
            	 System.out.println(number);
             }
			
		}

		

	}


