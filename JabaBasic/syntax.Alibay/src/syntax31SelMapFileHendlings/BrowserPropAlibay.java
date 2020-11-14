package syntax31SelMapFileHendlings;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;


public class BrowserPropAlibay{

	
	public BrowserPropAlibay(String filePath) {
			
		}

	public static void main(String[] args) throws IOException {
	//To read the file:
	//1. have file
	String filePath="/Users/apple/eclipse-workspace/java basics/configs/Browsersfile";
	//2. Bring object of FileInputInputStream
	
	FileInputStream  fileInput=new FileInputStream  (filePath);

	//To handle date from .properties file we need Property Class
	Properties prop=new Properties();
	prop.load(fileInput);

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


