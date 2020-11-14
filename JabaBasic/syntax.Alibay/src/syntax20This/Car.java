package syntax20This;
public abstract class Car {
	
String make,model, sportModel;	

public Car() {	
System.out.println("I am paret class constructor");
}
public Car(String make, String model) {
this.make=make;
this.model=model;

}
class Mercedes extends Car{
	
Mercedes (String make, String model){
super(make, model);
this.model=model;
}
public Mercedes() {
System.out.println("I am Child class constructor");
}

public Mercedes(String make,String model,String sportModel) {
super (make,sportModel);
this.sportModel=sportModel;
}

public void display() {
System.out.println("I have "+make+" "+model+" "+sportModel);
}}
protected abstract void display();}
