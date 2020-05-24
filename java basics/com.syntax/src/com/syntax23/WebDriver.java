package com.syntax23;
public class WebDriver {
	
public void open() {
System.out.println("Opening browser");
}
}
class FireDriver extends WebDriver{
public void open() {
System.out.println("Opening firefox browser");	
}
}class ChromeDriver extends WebDriver {
public void open() {
System.out.println("Opening chrom browser");	
}
}
class InternetExplorerDriver extends WebDriver {
public void open() {
System.out.println("Opening ie browser");
}
}