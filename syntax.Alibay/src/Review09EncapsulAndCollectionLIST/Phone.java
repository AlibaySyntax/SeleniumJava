package Review09EncapsulAndCollectionLIST;
public class Phone extends PhoneDemo {
//private var
private String serialNumber;
private String brand;
//double price;
private String password;
//public variable
public double price;

public Phone(String serialNumber,String brand) {
//if(serialNumber.length )
this.serialNumber=serialNumber;
this.brand=brand;
}
public void displayInfo() {
System.out.println("this a " + this.brand+" serial: "+serialNumber);
System.out.println("It cost: $" + price);

}//getter and setter
public String getSerialNumber(String password) {
	String result="";
if (this.password.equals(password)) {
	result ="Invalid access";
}else {
	result=serialNumber;
}
return result;
}
//getter/setter
public void setSerialNumber(String serialNumber) {
this.serialNumber=serialNumber;
}
//brand is view only
public String getBrand(){
return brand;
}
}

