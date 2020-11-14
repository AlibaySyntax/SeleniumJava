package Selen02WebDriver;

public class SFirefoxDriver implements SWebDriver {
public SFirefoxDriver() {
System.err.println("Opening Firefox browser....");	
    }
	@Override
	public void get(String url) {
	System.out.println("Lunching url :: "+url);	
	}

	@Override
	public void getCurrentUrl() {	
	}

	@Override
	public void close() {	
	}

	@Override
	public void getTitle() {
			
	}
	}
