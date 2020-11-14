package Runners;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.plugin.Plugin;
@RunWith( Cucumber.class)
@CucumberOptions(
		//features="src/test/resources/features/Dashboard.feature", // <-- DashboardRunner
		//features="src/test/resouces/features", // <-- RegressoinRunner
		//features="src/test/resouces/features/src/test/resources/features/LoginOld.feature", // <-- SmokeRunner
		//features="Cucumber.Alibay/src/test/resources/features/Login.feature", // Specify with feature file to run in our case we do say to run all features inside features package
		//glue="com/hmrs/Steps",// Where we can find implementation code for ghekrin steps?
		dryRun=true, // If set true it will quickly scan that all gherkin steps have implementation code
		            // It set to true no actual execution will happen
		monochrome=true,
		strict=true,
		//tags= "@smoke", 
		//tags="@regression",
		//tags="inProgress",
		//tags="@Excel",
		//tags="@temp",
		//tags="@report",
		//)
		plugin= {
				"pretty",//prints gherkin steps in console
				"html:target/cucumber-default-report",//create basic html report in cpecified
				"json:target/cucumber.json",
				//"return:target/failed.txt"
})
public class TestRunner {

}
