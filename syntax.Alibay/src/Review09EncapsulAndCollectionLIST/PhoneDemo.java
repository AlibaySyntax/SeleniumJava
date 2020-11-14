package Review09EncapsulAndCollectionLIST;
public class PhoneDemo {
public static void main(String[] args) {
		
Phone p1=new Phone("2345678","iPhone");
p1.price=1200;
System.out.println("Price "+p1);
p1.displayInfo();

System.out.println("----getting  ser. number---------");
//p1.serialNumber="bla bla";
String serial=p1.getSerialNumber("elion123");
System.out.println(serial);

serial=p1.getSerialNumber("password123");
System.out.println(serial);

System.out.println("--get serial number--");
p1.setSerialNumber("bla bla");
//p1.displayInfo();
}

}
