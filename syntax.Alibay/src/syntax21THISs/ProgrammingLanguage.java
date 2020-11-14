package syntax21THISs;
public class ProgrammingLanguage {

String name;
String variable;
}
class Java extends  ProgrammingLanguage{
String constructor;
Java(String constructor){
this.constructor=constructor;
}
public void details() {
System.out.println(name+ " can have variables "+variable+" and "+constructor);
}
}
//class JavaScript extends ProgrammingLanguage {
//public void details() {
//System.out.println(name+"can have variable"+variable);
//}
//}