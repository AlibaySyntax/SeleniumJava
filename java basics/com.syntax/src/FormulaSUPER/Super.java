package FormulaSUPER;

public class Super {
}
class Furniture {String color = "Red"; 
}
class Chair extends Furniture {
String color = "black"; 

void printColor () { 
System.out.println (color); // prints color of Chair class 
System.out.println(super.color); // prints color of Furniture class 
}
}
class MainClass {
public static void main (String args []) {
Chair d = new Chair ();  
d.printColor ();
}
}

