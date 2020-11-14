package syntax23Fainal;
public class FinalKeywordFORMULA {

public static String str="Hello";
public static final String str1="Bye";//Final variable=CONSTANT.

public static final String APPLICATION_URl="https://syntaxtechs.com";//Always UpperCase

final char GRADE='A';
		
public static void main(String[] args) {
str="Hi";
//str1="Bye"; CE:
//applicationURl="https://syntaxtechs.com";
}

public final void hello() {
System.out.println("I am a final method");
}

public final void hello(String name) {
System.out.println("Hello" +name);
}

}
class SubClass extends FinalKeywordFORMULA{

//public void hello() { CE: Cannot override final method

public void hello(int num) {// not overriding method signature is different),
System.out.println("hello of child class");
}	
}