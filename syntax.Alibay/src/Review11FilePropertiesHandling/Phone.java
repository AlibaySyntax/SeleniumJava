package Review11FilePropertiesHandling;
public class Phone {
	 
private String serialNumber;
private String brand;
double price;

public Phone(String serialNumber,String brand) {
this.serialNumber=serialNumber;
this.brand=brand;
}
public void displayInfo() {
System.out.println("This a " +this.brand+"phone with serial number: "+serialNumber);
System.out.println("It costs $ " + price);
}
//Getter and  Setter
public String getSerialNumber(String serialNumber) {
return serialNumber;
}
public void setSerialNumber(String serialNumber) {
this.serialNumber=serialNumber;
}
//Brand is view only
public String getBrand() {
return brand;
}
}
