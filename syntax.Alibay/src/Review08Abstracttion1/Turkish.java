package Review08Abstracttion1;


public class Turkish extends Human {
public Turkish(String name) {
super(name);
}
public void talk() {
System.out.println(name+ " Dior");
}
private void makeBaklava() {
System.out.println("I am making Baklava");
}
@Override
public void sleep() {
System.out.println("Can sleep");

}
}