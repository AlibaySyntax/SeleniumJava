package com.syntax31SelMapFileHendling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class FileReading {

public static void main(String[] args) throws IOException {

String filePath="/Users/apple/eclipse-workspace/java basics/configs";
System.out.println(filePath);

String userDirectory=System.getProperty("user.dir");
System.out.println(userDirectory);

String usename=System.getProperty("user.name");
System.out.println(usename);

String os=System.getProperty("os.name");
System.out.println(os);

String filePath1=System.getProperty("user.dir")+"/Users/apple/eclipse-workspace/java basics/configs/Browsersfile";//"/configs/configuration.property";
FileInputStream fis=new FileInputStream (filePath1);

Properties prop=new Properties();
prop.load(fis);


String browser=prop.getProperty("browser");
System.out.println(browser);

String url=prop.getProperty("url");
System.out.println(url);

String username=prop.getProperty("username");
System.out.println(username);

String password=prop.getProperty("password");
System.out.println(password);
//getting all keys from Property
Set<Object>keys=prop.keySet();
for(Object key:keys) {
System.out.println(key);

}}}
