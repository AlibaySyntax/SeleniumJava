package ReviewClass8OPolimorphism;

public class Belarusian extends Human {
public Belarusian(String name) {
super (name);
	
}
@Override
public void talk() {
System.out.println(name+ " Vitaly");
}
public void pickMushrooms() {
System.out.println(name+ "is picking Mushrooms");	
}
}
