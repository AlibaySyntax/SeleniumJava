package Steps;

import org.junit.After;
import org.junit.Before;

import cuUtils.CommonMethods;
import testBase.BaseClass;
//import cucumber.api.junit.Scenario;
//import io.cucumber.messages.Messages.Scenario;
//import io.cucumber.messages.Messages.GherkinDocument.Feature.Scenario;
//import io.cucumber.messages.Messages.GherkinDocument.Feature.Scenario;
//import io.cucumber.messages.Messages.Scenario;
//import cucumber.api.Scenario;
//import com.aventstack.extentreports.gherkin.model.Scenario;
//import io.cucumber.messages.Messages.GherkinDocument.Feature.Scenario;
//import gherkin.formatter.model.Scenario;
//import net.masterthought.cucumber.json.Scenario;
//import io.cucumber.java.Scenario;
import cucumber.api.junit.*;
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
	scenario.attach(pic,"image/png",scenario.getGherkinName()) ;
	BaseClass.tearDown();// <-- must be
	}
}
