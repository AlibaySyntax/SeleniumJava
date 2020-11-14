package Review01DataType;
public class TypeConversion {
public static void main(String[] args) {
	
 // YOU don't need to memorize it	
int intNumber=25;
double doubleNumber=intNumber;// Changed from INT to DOUBLE
System.out.println("The doubleNumber (DOUBLE) is: "+doubleNumber);

 // 19 is between -128 and 127
int numberInt=-19;// Changed from INT to DOUBLE
byte numberByte=(byte)numberInt;// Changed from INT to BYTE
System.out.println("The BYTE value is: "+numberByte);

 // 260 is bigger than 256
numberInt =260;
numberByte=(byte)numberInt;// Changed from INT to BYTE
System.out.println("The BYTE value is: " +numberByte);

numberByte=80;
numberInt=(int)numberByte;// Changed from BYTE to INT
System.out.println("The INT value is: "+numberByte);



}}
