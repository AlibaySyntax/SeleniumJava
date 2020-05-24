import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
public static Properties prop;

static static void readProperties (String filePath) {
	try {
	FileInputStream fis=new FileInputStream(filePath);
	Properties prop=new Properties();
	prop.load(fis);
	}catch(FileNotFoundException e) {
	e.printStackTrace();
	}catch(IOException e) {
	e.printStackTrace();	
}	
}
public static String getProperty(String key) {
	return prop.getProperty(key);
	
}
}
