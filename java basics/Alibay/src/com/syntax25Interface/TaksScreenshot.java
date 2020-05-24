package com.syntax25Interface;

public interface TaksScreenshot {
String fileExtension=".png";

void takePicture();
//}
//public interface Webdriver{

void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();
}
abstract class ChromeDriver implements TaskWebDriver, TaksScreenshot{

@Override
public void openBrowser(){;
System.out.println(" Open browser fast");
}
@Override
public void closeBrowser(){;
System.out.println(" close browser fast");
}}