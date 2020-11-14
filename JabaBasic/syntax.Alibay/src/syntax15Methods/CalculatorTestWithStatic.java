package syntax15Methods;
public class CalculatorTestWithStatic {
public static void main(String[] args) {
	CalculatorUsingVoid calc=new CalculatorUsingVoid();
	calc.add(100, 200);
	calc.sub(1000, 300);
	//calc.add(200);
	//calc.add(100.99, 200.99);

	calc.add(1000,2000);
	calc.sub(10, 3);
	calc.mult(20, 10);
	calc.div(20, 10);
	
}

}

