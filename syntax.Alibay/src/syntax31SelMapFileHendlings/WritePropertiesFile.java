package syntax31SelMapFileHendlings;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class WritePropertiesFile {

public static void main(String[] args) throws IOException {

String filePath="/Users/apple/eclipse-workspace/java basics/syntax.Alibay/Configs/Example.properties";	

FileInputStream fis=new FileInputStream(filePath) ;

Properties prop=new Properties();
prop.load(fis);

prop.setProperty("phoneNumber", "123456789");

FileOutputStream fos=new FileOutputStream (filePath);
prop.store(fos, "Added additonal key");
}}

