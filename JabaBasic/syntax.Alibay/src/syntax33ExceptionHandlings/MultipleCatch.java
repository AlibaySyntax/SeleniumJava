package syntax33ExceptionHandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

public static void main(String[] args) throws FileNotFoundException {

String file=System.getProperty("user.dir")+"/configs/configuration.properties";
try {
FileInputStream fis=new FileInputStream(file);//new FileNotFounException();
fis.close();
Properties prop=new Properties();
prop.load(fis);// new IOException();

}catch(IOException e) {
e.printStackTrace();

} catch (Exception e) {
e.printStackTrace();
}
System.out.println("---End of the Program---");

}
}
