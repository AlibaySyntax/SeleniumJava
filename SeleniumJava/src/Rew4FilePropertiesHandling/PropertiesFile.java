package Rew4FilePropertiesHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
public static void main(String[] args) throws FileNotFoundException,IOException   {

String projectPath=System.getProperty("user.dir");
System.out.println(projectPath);

String filePath=projectPath + "/Configs/DemoExample.properties"; //"/extra/Example.properties";
System.out.println(filePath);

String filePath1=projectPath + "/Configs/Example.properties"; //"/extra/Example.properties";
System.out.println(filePath1);

// The filePath --> (/Configs/DemoExample.properties)
//===========================================================
FileInputStream fileIS=new FileInputStream(filePath);
Properties proper=new Properties();
proper.load(fileIS);
System.out.println(proper);

//The filePath1 --> (/Configs/Example.properties)
//===========================================================
FileInputStream fileIS1=new FileInputStream(filePath1);
Properties proper1=new Properties();
proper.load(fileIS1);
System.out.println(proper1);
//===========================================================

// 1st Way. Get the value as Object and downcast intro a String
String lastname=(String)proper.get("LastName");
System.out.println("LastName -> "+lastname);

// 2nd Way. Get the value as a String
String firstname=proper.getProperty("FirstName");
System.out.println("FirstName -> "+firstname);
//
String school=proper.getProperty("School");
System.out.println("School|Syntax -> "+school);

// 1st Way. Use getProperty method to get age as an String
String age1=proper.getProperty("Age");
System.out.println("age1 "+age1);

// 1st Way. Use get method to get age as an Object
String age2=(String)proper.get("Age");
System.out.println("age2 "+age2);

// Add more key
proper.setProperty("StudentNumber", "123");
System.out.println(proper);

// Or we can reassign
proper.setProperty("FirstName", "");
System.out.println(proper);

// Let's write/save  back into the properties file
FileOutputStream fileOS=new FileOutputStream(filePath);
proper.store(fileOS,"Hi there");
System.out.println("Done");







}
}
  