package syntax18Constructors;
public class USA {
//Create variable to hold state and capital of the state
String state, stateCapital;
//public void Country (String string, String string2) {
	
//}
//Create method to display state and stateCapital
public void display() {
System.out.println(state+ "and it's capital is "+ stateCapital);
}
//Create a Costructor that will iniiate instance variable
public  USA(String state,String stateCapital) {
	this.state=state;
	this.stateCapital=stateCapital;
}
public static void main(String[]args) {
	USA usa=new USA ("Virginia ","Richmond");
	usa.display();
}
}
