package com.testautomation.TestRunner;
//import org.testng.annotations.Test;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.junit.runner.RunWith;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;

//import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
//@RunWith( Cucumber.class)

@CucumberOptions(
		features="./features",
		glue="com.testautomation.StepDef",
		tags= "@UATTesting", 
		plugin= {
				"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json"},
		monochrome=true)
public class TestRunner {
private TestNGCucumberRunner testNGCucumberRunner;

@BeforeClass(alwaysRun=true)
public void setUpClass() throws Exception {
testNGCucumberRunner = new TestNGCucumberRunner (this.getClass());
}
@Test (dataProvider= "features")
public void feature( CucumberFeatureWrapper cucmberFeature) {
testNGCucumberRunner.runCucumber(cucmberFeature.getCucmberFeature());
}
@DataProvider
public Object[][] features(){	
return testNGCucumberRunner.provideFeatures();	
}
@AfterClass(alwaysRun=true)
public void tearDownClass()throws Exception {
testNGCucumberRunner.finish();	
}

}	

