package Runners;
import org.junit.runner.RunWith;
import cucumber.deps.com.thoughtworks.xstream.annotations.*;
import io.cucumber.testng.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="/Users/apple/eclipse-workspace/Java Basic/CucumberCRM/src/main/java/Features/Login.feature", 
			glue= {"StepDefinitions"},
			tags="@crm",
			plugin= {"pretty","html:test-output",
					"html:target/cucumber-default-report",//create basic html report in cpecified
					"json:target/cucumber.json"
})
public class TestRunner {	
}
