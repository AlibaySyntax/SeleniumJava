package syntax11Array;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		
		// let create 2d array in which we store professions
		
		String[][] professions= {
				{"QA Tester", "Developers","Product Owner", "Scrum Master"},
				{"Math teacher","Science teacher", "ESL teacher"},
				{"Dentist", "Surgeon"}
		};
		
		//get elements using advanced for loop
		
		for(String[] occupation:professions) {
			for(String title:occupation) {
			System.out.println(title + " ");
			}
			System.out.println();
		}

	}

}
