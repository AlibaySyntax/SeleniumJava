package Runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith( Cucumber.class)
@CucumberOptions(
		features="@target/failded.txt",
		glue="com/Cucumber.Alibay/Steps",// Where we can find implementation code for ghekrin steps?
		monochrome=true,
		plugin= {
				"pretty",//prints gherkin steps in console
				//"html:target/cucumber-default-report",//create basic html report in cpecified
				//"json:target/cucumber.json",
				//"return:target/failed.txt"
		        })
public class FailedRunner {

}
