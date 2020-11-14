package cuUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.AddEmployeePageElements;
import Pages.LoginPageElements;
import testBase.PageInitializer;



public class CommonMethods extends  PageInitializer { 
// PageInitializer. testNG3FrameworkEnh.PageInitializer
//Method that clears and sends keys. /@param element. /@param text 
	
public static byte[] takeScreenshot(String filename) {
TakesScreenshot ts=(TakesScreenshot)	driver;
byte[]picBytes=ts.getScreenshotAs(OutputType.BYTES);

File file =ts.getScreenshotAs(OutputType.FILE);
String destinationFile=Constants.SCREENSHOT_FILEPARH + filename+getTimeStemp()+".png";

try {
FileUtils.copyFile(file,new File(destinationFile));
}catch(Exception ex) {
System.out.println("Cannot take screenshot!");	
}
return picBytes;
}
public static void sendText(WebElement element,String text) {
element.clear();
element.sendKeys(text);
}
// Method checks if radio/checkbox is enabled and clicks it. /@param radioOrcheckbox. /@param value
public static void clickRadioOrCheckbox(List<WebElement> radioOrcheckbox,String value, String actualValue) {

	String actualvalue;
	for(WebElement el:radioOrcheckbox) {
	actualValue=el.getAttribute("value").trim();
	if(el.isEnabled()&& actualValue.equals(value)) {
	el.click();
	break;		
}}}
//Method that checks if text is there and then selects it. /@param ement. /@param textToSelect 
public static void selectDdValue(WebElement element,String textToSelect) {
try {
Select select=new Select(element);
List<WebElement>options=select.getOptions();
for(WebElement el:options) {
if(el.getText().equals(textToSelect)) {
select.selectByVisibleText(textToSelect);
break;
}}
}catch(UnexpectedTagNameException e) {
e.printStackTrace();
}}
//Method that selects value by index. / @param element. /@param index  
public static void selectDdValue(WebElement element, int index) {
try {
	Select select=new Select (element);
	int size=select.getOptions().size();
	if(size>index) {
	select.selectByIndex(index);
	}
}catch (UnexpectedTagNameException e) {
e.printStackTrace();	
}
}
public static void acceptAlert() {
try {
Alert alert=driver.switchTo().alert();
alert.accept();
}catch(NoAlertPresentException e) {
e.printStackTrace();	
}
}
//Methods that dismiss alerts and catches exception if alert is not present
public static void dismissAlert(String alertText) {
try {
Alert alert=driver.switchTo().alert();
alert.dismiss();	
}catch(NoAlertPresentException e) {
e.printStackTrace();
}
}

//Methods that gets text of alert and catches exception if alert is not present
public static String  getAlertText() {
String alertText=null;
try {
Alert alert=driver.switchTo().alert();
alertText= alert.getText();
}catch(NoAlertPresentException e) {
e.printStackTrace();
}
return alertText;
}
//===========================
public static void sendAlertText(String alertText) {
try {
Alert alert=driver.switchTo().alert();
alertText=alert.getText();	
}catch(NoAlertPresentException e) {
e.printStackTrace();
}
}
//===========================
public static void switchToFrame(String nameOrId) {	
try {
driver.switchTo().frame(nameOrId);
}catch(NoSuchFrameException e) {
e.printStackTrace();
}
}
//===========================
public static void switchToFrame(WebElement element) {
try {
driver.switchTo().frame(element);
}catch(NoSuchFrameException e) {
e.printStackTrace();
}
}
//===========================
public static void switchToFrame(int index) {
try {
driver.switchTo().frame(index);
}catch(NoSuchFrameException e) {
e.printStackTrace();
}	
}
//===========================
public static WebDriverWait getWaitObject() {
WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_WAIT_TIME);
return wait;
}
//This Method will take screenshot @param filename
//===============================
public static byte[] takeScreeenshot(String filename) {
TakesScreenshot ts=(TakesScreenshot)driver;
byte[]picBytes=ts.getScreenshotAs(OutputType.BYTES);
File file=ts.getScreenshotAs(OutputType.FILE);
String destinationFile=Constants.SCREENSHOT_FILEPATH+filename+getTimeStemp()+".png";
try {
FileUtils.copyFile(file, new File("screenshot/"+filename+".png"));
}catch(Exception ex) {
System.out.println("Cannot take screenshot!");	
}
return picBytes;
}
private static String getTimeStemp() {
Date date=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
return null; // return sdf.format( ( date.getTime();
}
// Wait ======================
public static void wait(int second) {
try {
Thread.sleep(second*1000);
}catch(InterruptedException e) {
e.printStackTrace();
}
}
//===========================
public static void waitForClickability(WebElement element) {
getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
}
public static void Configs() {	
FileUtils.getFile("/Users/apple/eclipse-workspace/java basics/TestNG/Configs");	
//GetField.class.descriptorString();
}
//=====================================================
//Method that will scroll the page down based on the passed pixel parameters
//@parm pixel
public static void scrollUp(int pixel) {
getJSObject().executeScript("window.scrollBy(0,-"+pixel+")"); // getJSObject().executeScript("window.scrollBy(0,-"+pixel+")");

}
//=====================================================
// Method that will scroll the page down based on the passed pixel parameters
// @parm pixel
public static void scrollDown(int pixel) {
getJSObject().executeScript("window.scrollBy(0,"+pixel+")");	

}
public static void click(WebElement element) {
waitForClickability(element);
element.click();

}
public static void scrollToElement(WebElement element) {
getJSObject().executeScript("arguments[0].scrollIntoView(true);",element);

}
protected void suaceLogin(LoginPageElements login, LoginPageElements loginBTN) {
sauceLogin(loginBTN);	
	
}
private void sauceLogin(Object loginBTN) {
sauceLogin(loginBTN);	
}

protected void jsClick(WebElement addEmp) {
jsClick(addEmp);
}

protected void waitForVisibility(WebElement lblPersnalDetails) {
waitForVisibility(lblPersnalDetails);	
}
//============================
public static void selectCalendarDate(List<WebElement>element,String text) {
for(WebElement pickDate:element) {
if(pickDate.getText().equals(text)) {
if(pickDate.getText().equals(text)) {
pickDate.click();
break;
}}}}}




