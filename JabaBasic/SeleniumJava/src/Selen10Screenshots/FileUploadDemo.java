package Selen10Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FileUploadDemo {

public static void main(String[] args) throws InterruptedException {
	
String filePath="/Users/apple/Desktop/MyFile.png";
String url="https://the-internet.herokuapp.com";
		
System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");
System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get(url);
//click on File Upload link
driver.findElement(By.linkText("File upload")).click();
//click on choose File
driver.findElement(By.id("file-upload")).click();//Instead f click use senKeys();
//We simply use sendKeys() method to upload the file
driver.findElement(By.id("file-upload")).sendKeys(filePath); // ("Users/apple/eclipse-workspace.png");// Another way "screenshots/HRMS/pics.png".

driver.findElement(By.id("file-sumbit")).click();
Thread.sleep(3000);
driver.quit();

}
}