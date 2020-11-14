package Selen02WebDriver;

public   class SChromeDriver implements SWebDriver {
	
public SChromeDriver () {
System.err.println("Opening chrome Browser...");

}	
@Override
public void get(String url) {
System.out.println("Lunching the url:: "+url);

}
@Override
public void getCurrentUrl() {
System.out.println("Retrieving Current URL");

}
@Override
public void close() {
System.out.println("Closing the current window");

}
@Override
public void getTitle() {
		
}}
		

