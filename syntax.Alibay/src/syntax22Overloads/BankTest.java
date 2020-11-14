package syntax22Overloads;
public class BankTest {
	
public static <println> void main(String[] args, double fee) {
		
Bank bank=new Bank(700);
fee=bank.chargeFee();
System.out.println(fee);

BOA boa=new BOA(700);
fee=boa.chargeFee();
System.out.println(fee);

TD td=new TD(700);
fee=td.chargeFee();
System.out.println(fee);

PNC pnc=new PNC(700);
fee=pnc.chargeFee();
System.out.println(fee);
}
}
