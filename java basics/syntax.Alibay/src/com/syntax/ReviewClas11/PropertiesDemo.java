package com.syntax.ReviewClas11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

public static void main(String[] args) throws IOException {
String projectPath=System.getProperty("user.dir");
System.out.println(projectPath);

String filePath=projectPath+"/extra/demo.properties";
System.out.println(filePath);

FileInputStream fileIS=new FileInputStream(filePath);
Properties proper = new Properties();
proper.load(fileIS);

System.out.println(proper);
//1st way.Get the Value as Object and downcast into a String
String lastname=(String)proper.get("LastName");
System.out.println("LastName --> "+lastname);
//2nd way.Get the value as a String
String firstname=proper.getProperty("FirstName");
System.out.println("FirstName--> "+firstname);
String school=proper.getProperty("School|Syntax");
System.out.println("School|Syntax-->"+school);
//Get age as a String
String age1=proper.getProperty("Age");
System.out.println("age1"+age1);

//1st way. Use pet method to get age as an Object
String age2=(String)proper.get("Age");
System.out.println("age2" +age2);
//Add more key value-->value pairs
proper.setProperty("StudentNumber","123");
System.out.println(proper);
//Or we can override
proper.setProperty("FirstName", "Omar");
System.out.println(proper);
//Let's write back into the properties
FileOutputStream fileOS=new FileOutputStream(filePath);
proper.store(fileOS, "");

}

}
