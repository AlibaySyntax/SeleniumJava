package GettersNSetters;

public class GetterSetterAccount {
 
String name;
int age;

public static void main(String[] args) {
	
GetterSetterAccount a = new GetterSetterAccount ();

a.setName("Alibay Aitov");
a.setAge(46) ;

//System.out.println(a.getName()); // -> this another way
//System.out.println(a.getAge());  // -> this another way

a.printDetails();
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}

void printDetails() {
	
System.out.println(name+ ", "+ age);
//  OR
//*********************************************
System.out.println("************************");
System.out.println(getName()+ ", " +getAge() );
}	
}


