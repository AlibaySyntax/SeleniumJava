package com.testautomation.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {

public Properties getProperty() {
FileInputStream inputStream=null;
Properties properties=new Properties();
try {
properties.load(new FileInputStream("resources/browser-configs.properties"));
}catch(Exception e) {
System.out.println("Exception: "+e);
}
return properties;
}

}
