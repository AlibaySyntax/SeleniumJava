package ReviewClass3LOOP;
public class ContinueDEmo {//for skip
public static void main(String[] args) {
//I want to celebrate my son's 20 birthdays but not 13th birthday
//Let's use for loop
     //int age=0;
     //while(age<10) {
    	// age++;
    	// System.out.println(); 
	for(int age=1; age<=20; age++) {
		//1st way without continue
		//if(age !=13) {
		//System.out.println("Happy birthday! You are"+age+"years old.");
	//}
     //2
		if (age==1) {
	System.out.println("Happy birthday! You are\"+age+\"years old.");
		}
		boolean happy=false;
		if(happy) {
			System.out.println("Happy");
		}else {
			System.out.println("Unhappy");
		if(!happy) {
			System.out.println("Unhappy");
		}else {
			System.out.println("Happy");
		}
					
					
	//3nd way with continue	
	//if (age == 13) {
		//continue;//this is skip		
}
	///System.out.println("Happy birthday! You are "+age+" years old.");	
	}}}
