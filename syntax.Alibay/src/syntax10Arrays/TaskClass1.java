package syntax10Arrays;
public class TaskClass1 {
public static void main(String[] args) {
		
// create an array of animals and retrieve all elements
String []countries= {"USA","Turkey"};

for(String country:countries) {
	
	if(country.equals("USA")) {
		System.out.println("The capital of "+country+" is Washington");
		
		if(country.equals("Turkey")) {
			System.out.println("The capital of "+country+" is Ankara");

			System.out.println("========2nd way=======");
			
			for(int y=0; y<countries.length; y++) {
				switch(countries[y]) {
				
				case "USA":
					System.out.println("The capita Washington");
					break;
				case "Turkey":
					System.out.println("The capita Ankara");
					break;	
					
				}
				
			}
}}}}}
