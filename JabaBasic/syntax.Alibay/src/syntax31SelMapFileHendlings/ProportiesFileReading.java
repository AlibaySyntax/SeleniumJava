package syntax31SelMapFileHendlings;
//Shortcat for import for windoows ctrl+shif+o//for MAC command+shift+o
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
public class ProportiesFileReading {

public static void main(String[] args) throws IOException {
//To read the file:
//1. have file
String filePath="/Users/apple/eclipse-workspace/java basics/syntax.Alibay/Configs/Example.properties";
//2. Bring object of FileInputInputstream

FileInputStream fileInput=new FileInputStream(filePath);

//To handle date from .properties file we need Property Class
Properties prop=new Properties();
prop.load(fileInput);

String name=prop.getProperty("name");
System.out.println(name);

String lastName=prop.getProperty("lastName");
System.out.println(lastName);

String city=prop.getProperty("city");
System.out.println(city);

String country=prop.getProperty("country");
System.out.println(country);
//getting all keys from Property
Set<Object>keys=prop.keySet();
for(Object key:keys) {
System.out.println(key);	
}

}
}
