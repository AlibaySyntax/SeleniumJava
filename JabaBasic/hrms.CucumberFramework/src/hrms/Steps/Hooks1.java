package hrms.Steps;

import org.junit.After;

import hrms.Utils.CommonMethods;
import hrms.testBase.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks1 {
	@Before
	public  void start( ) {
	BaseClass.setUp();// <-- must be
	}
	@After
	public void end(Scenario scenario) {
		
	byte[] pic;
	if(scenario.isFailed()) {
	pic=CommonMethods.takeScreeenshot("failed/"+scenario.getName());	
	}else {
	pic=CommonMethods.takeScreeenshot("passed/"+scenario.getName());
	}
	scenario.attach(pic,"image/png",scenario.getName()) ;
	BaseClass.tearDown();// <-- must be
	}
}
