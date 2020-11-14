package syntax18Constructors;
public class FormulaTest {

void m1() {
System.out.println("m1 Method");
}
FormulaTest(){
System.out.println("0 - arg Constructor");
}
FormulaTest(int i){
System.out.println("1 - arg Constructor");
}
public static void main(String []args) {
FormulaTest t1=new FormulaTest();
FormulaTest t2=new FormulaTest(10);
t1.m1();
t2.m1();
}
}
