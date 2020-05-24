package com.syntax25Interface;

interface TakesScreenshot{
String fileExtension=".png";
void takePicture();
//Features below were added from Java 1.8 version
static void takeSelfie() {
System.out.println("I can take a selfie");
}
default void takePanoramaPic() {
System.out.println("I can take panoramic pictures");	
}
}
public interface TaskWebDriver {

void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();
void run();
void internet();
void site();
}
abstract class ChromDriver implements TaskWebDriver,TakesScreenshot {
@Override
public void  openBrowser() {
System.out.println("We can open Chrome");	
}
@Override
public void closeBrowser() {
System.out.println("We can close Chrome");
}	
@Override
public void maximizeWindow() {
System.out.println("we can maximaize Chrome window");
}
@Override
public void findElement() {
System.out.println("We can find element in Chrome");	
}
@Override
public void takePicture() {
System.out.println("I chrome we can take picture");	
}
}
abstract class FirefoxDriver extends ChromDriver implements TaskWebDriver {
@Override
public void run() {
System.out.println("too fast");	
}
@Override
public void internet() {
System.out.println("Browser");	
}
@Override
public void site() {
System.out.println("good interface");	
}
}


