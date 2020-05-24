package ReviewClass8Abstracttion2;

public abstract class Human {

String  name;
static String planet;
public Human (String name) {
this.name=name;
}
abstract void talk();

public void sleep() {
System.out.println("All human sleep");
}
}
