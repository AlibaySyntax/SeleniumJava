package syntax22Overloads;
public class AreaTestHW {
public static void main(String[] args) {
	
AreaTestHW obj=new AreaTestHW();
int area=obj.region(12);
System.out.println(area);
	
area=obj.region(40);
System.out.println(area);
	
String str="Hello friends";
System.out.println(str.substring(6));//friends
System.out.println(str.substring(0,5));//hello
}
private int region(int i) {
return 12;
}
}

