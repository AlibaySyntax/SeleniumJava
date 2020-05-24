package FormulaOVERRIDE;

public class Override2  {
public static void main(String[] args) {
Override2 ov = new Override2();
ov.java("Override");
ov.eclipse("Override");
}

private void java(String string) {
System.out.println("Java can Work");	
}
private void eclipse(String string) {
System.out.println("Eclipse can write");

//ov.eclipse();
}
}