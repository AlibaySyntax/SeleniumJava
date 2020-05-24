package Sel02WebDriver;

public class Example {
	public interface  SWebDriver {
		
		public void get(String url);
		public void getCurrentUrl();
		public void close();
		public void getTitle();
		
		public   class SChromeDriver implements SWebDriver {
			
			public SChromeDriver () {
			System.err.println("Opening chrome Browser...");	
			}	

				@Override
				public void get(String url) {
				//System.out.println("Lunching the url:: "+url);	
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
					
				}
					
					public static void main(String[] args) {

						SWebDriver driver =new SChromeDriver();
						driver.get("https://www.google.com");
						driver.close();
						
						SWebDriver driver2=new SChromeDriver();
						driver2.get("https://www.google.com");						
}
}}}
