package Steps;

import cuUtils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testBase.BaseClass;



public class Hooks1  {
@Before
public  void start( ) {
BaseClass.setUp();// <-- must be
}
@After
public void end(Scenario scenario) {	
byte[] pic;
if(scenario.isFailed()){
pic=CommonMethods.takeScreeenshot("failed/"+scenario.getName());	
}else {
pic=CommonMethods.takeScreeenshot("passed/"+scenario.getName());
}
scenario.attach(pic,"image/png",scenario.getName()); //<-- shoud be getGherkinName()
BaseClass.tearDown();// <-- must be
}
}
