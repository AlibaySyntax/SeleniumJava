import java.lang.constant.ConstantDescs;
import java.sql.Driver;
import java.util.*;
public class BaseClass {
public static void setUp() {
	
ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
switch(ConfigsReader.getProperty("browser").toLowerCase()) {
case "chrome":
	System.out.println("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
	WebDriver driver=new ChromeDriver();
	break;
case "firefox":
	System.out.println("webdriver.gecko.driver",Constants.GECKO_DRIVER_PATH);
	driver=new FirefoxDriver();
	break;
	default:
		throw new RuntimeException("Bowser is not supported");
}
driver.get(ConfigsReader.getProperty("url"));
}
public static void tearDown() {
if(driver!=null) {
	driver.quit();
}
}
}
