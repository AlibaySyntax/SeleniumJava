package ReviewClass8;
public class PhoneDemo {
public static void main(String[] args) {
		
Phone p1=new Phone("2345678","iPhone");
p1.price=1200;
System.out.println("prise" + price);
p1.displayInfo();

System.out.println("----getting  ser. number---------");
//p1.serialNumber="bla bla";
String serial=p1.getSerialNumber("elion34");
System.out.println(serial);


//p1.displayInfo();
}

}
