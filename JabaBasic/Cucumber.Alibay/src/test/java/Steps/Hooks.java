package Steps;

//import cucumber.api.Scenario;
//import com.aventstack.extentreports.gherkin.model.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.masterthought.cucumber.json.Scenario;
//import io.cucumber.plugin.event.Node.Scenario;
//import io.cucumber.messages.Messages.GherkinDocument.Feature.Scenario;
//import io.cucumber.messages.Messages.Scenario;
import testBase.BaseClass;
public class Hooks {
@Before
public  void start(Scenario scenario ) {
System.out.println("Starting test: "+scenario.getName());
BaseClass.setUp();// <-- must be
}
@After
public void end(Scenario scenario) {
System.out.println("Ending test: "+scenario.getName());	
System.out.println(scenario.getStatus());
BaseClass.tearDown();// <-- must be
}

}
