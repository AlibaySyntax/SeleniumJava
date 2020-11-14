package Runners;
import org.junit.runner.RunWith;
//import cucumber.deps.com.thoughtworks.xstream.annotations.*;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="/Users/apple/eclipse-workspace/Java Basic/CucumberCRM/src/main/java/Features/Login.feature", 
			glue= {"StepDefinitions"},
			plugin= {"pretty","html:test-output"}
			)
	public class TestRunner {	
}
