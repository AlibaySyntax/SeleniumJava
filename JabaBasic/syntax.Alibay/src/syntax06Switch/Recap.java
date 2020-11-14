package syntax06Switch;

public class Recap {

	public static void main(String[] args) {
		/*if hour between 1-11 --->morning
		 * if hour between 12-15-->afternoon
		 * 16-20 -->evening
		 * 21-24-->night
		 */
		int hour =90;
		String timeOfDay;
		
		if(hour>=1 && hour<=11) {
			timeOfDay="Morning";
			
		}else if (hour>=12 && hour <=15) {
			timeOfDay ="afternoon";
			
		}else if (hour>=16 && hour<=20) {
			timeOfDay="evening";
		}else if (hour>=21 && hour <=24) {
			timeOfDay= "night";
			
		}else {
			timeOfDay ="Uknown";
			
			
		}
		//if time of the day is not unknown-->only then i want to see the message
		//System.out.println("right now is " + timeOfDay);
         
		if(!timeOfDay.contentEquals("Unknown")) {
			System.out.println("right now is " + timeOfDay);
		}
	}

}
