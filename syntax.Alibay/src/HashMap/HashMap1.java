package HashMap;
import java.util.HashMap;

public class HashMap1 {
public static void main(String[] args) {
	

HashMap<String,String>fun=new HashMap<String,String>();
fun.put("Adidas","Puma");
fun.put("Kitty","Aloe");
fun.put("Swag","password123");


fun.remove("Kitty");

//*********************************************
System.out.println("***********************");
System.out.print(fun.containsKey("Swag"));
System.out.println(fun.replace("Adidas","Nike"));
System.out.println("***********************");
System.out.println(fun);
System.out.println("***********************");
System.out.println(fun.keySet());	
}
}
