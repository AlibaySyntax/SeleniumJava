package hrms.Runners;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;

@RunWith( Cucumber.class)
@CucumberOptions(
		features="src/test/resouces/features/Login.feature", // Specify with feature file to run in our case we do say to run all features inside features package
		glue="com/hmrs/steps",// Where we can find implementation code for ghekrin steps?
		//dryRun=true, // If set true it will quickly scan that all gherkin steps have implementation code
		            // It set to true no actual execution will happen
		monochrome=true,
		strict=true,
		//tags= "@smoke or @regression",
		//tags="inProgress"
		tags="@Excel"
		)
//		plugin= {
//				"pretty",//prints gherkin steps in console
//				"html:target/cucumber-default-report",//create basic html report in cpecified
//				"json:target/cucumber.json"
//})
public class TestRunner {

}
