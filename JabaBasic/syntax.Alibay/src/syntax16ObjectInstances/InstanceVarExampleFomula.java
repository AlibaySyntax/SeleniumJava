package syntax16ObjectInstances;
public class InstanceVarExampleFomula {
	 
String myInstanceVar="instance variable";

public static void main(String args[]) {
InstanceVarExampleFomula obj = new InstanceVarExampleFomula();
InstanceVarExampleFomula obj2 = new InstanceVarExampleFomula();

System.out.println(obj.myInstanceVar);
System.out.println(obj2.myInstanceVar);

obj2.myInstanceVar = "Changed Text";

System.out.println(obj.myInstanceVar);
System.out.println(obj2.myInstanceVar);   	

}}
