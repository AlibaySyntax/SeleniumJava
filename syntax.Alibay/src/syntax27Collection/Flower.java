package syntax27Collection;
public abstract class Flower {
//Deffine flower class that will have String type
//constructor that initializes a variables and underfine method bloom
public String type;	
public Flower (String type){
this.type=type;
}
public abstract void bloom();
}
class Tulip extends Flower {
public Tulip(String type) {
super(type);
}
@Override
public void bloom() {
System.out.println(type+"bloom in March");
}
}
class Rose extends Flower{
public Rose(String type) {
super(type);	
}
@Override
public void bloom() {
System.out.println(type+ "blooms in June");	
}
}
class Sunflower extends Flower{
	
public Sunflower(String type) {
super(type);
}
@Override
public void bloom() {
System.out.println(type+ "blooms in August");
}
}


