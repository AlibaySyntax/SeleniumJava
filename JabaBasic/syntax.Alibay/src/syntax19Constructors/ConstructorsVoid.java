package syntax19Constructors;
public class ConstructorsVoid {
	
String str="Hello";
	
ConstructorsVoid(){
System.out.println("I am your constructor");
System.out.println("I am non arguments constructor");
	}
	ConstructorsVoid(String str){
		System.out.println("I am a constructor with parameter");
	}
	ConstructorsVoid(int num){
		System.out.println("with integer value");
	}
	ConstructorsVoid(String s, int num){
		System.out.println("with String and integer value");
	}
	void ConstructorsVoid() {
		System.out.println("I am a return type method not a constructor");
	}
	void hi(String a, String b) {
		System.out.println("methode with parameter");
	}
	public static void main(String[] args) {
		ConstructorsVoid obj= new ConstructorsVoid();
		ConstructorsVoid obj1=new ConstructorsVoid("it rainy day");
		ConstructorsVoid obj2= new ConstructorsVoid( 12);
		ConstructorsVoid obj3=new ConstructorsVoid("yes", 13);
		obj.ConstructorsVoid();
	}
}

