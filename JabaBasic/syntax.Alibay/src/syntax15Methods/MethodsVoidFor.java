package syntax15Methods;
public class MethodsVoidFor {
	
//create a method that will say welcome 10 time
	void sayWelcome() {
	for(int i=0; i<3; i++) {
	System.out.println("Welcome");
}}
	// create method that will any word # of times
	void sayAnithig(String word, int times) {
	for(int i=1; i<=times; i++) {
	System.out.println(word);
}}
   //create a method isItRaining
   //that will accept  boolean value as a param
   //and based on the value it will print message accordingly
	void isItRaining(boolean isRain)  {
		if(isRain) {
   System.out.println("It is raining stay home and learnJava");
		}else {
   System.out.println("It is not raining go for a walk");
   
}}
public void sayAnything(String string, int i) {
}
	
}
