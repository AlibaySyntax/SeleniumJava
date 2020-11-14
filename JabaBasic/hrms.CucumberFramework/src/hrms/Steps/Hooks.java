package hrms.Steps;

import org.junit.After;

import hrms.testBase.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
